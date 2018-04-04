
public class NodeSet {
	
		private Node head = null;
		
		public boolean add(int data) {
			if(head == null) head = new Node(data, null);
			else {
				Node p = head;
				while(p.getNext() != null) {
					p = p.getNext();
				}
				p.setNext(new Node(data, null));
			}
			return true;
		}
		
		public boolean remove(int data) {
			if(head == null) return false;
			else {
				if(head.getData() == data) {
					head = head.getNext();
					return true;
				}
				else {
					for(Node p = head; p != null; p = p.getNext()) {
						if(p.getNext().getData() == data) {
							p.setNext(p.getNext().getNext());
							return true;
						}
					}
				}
			}
			return false;
		}
		
		public boolean evenRemove() {
			if(head == null) return false;
			else {
				for(Node p = head; p != null; p = p.getNext()) {
					if(p.getNext().getData() % 2 == 0) {
						p.setNext(p.getNext().getNext());
					}
				}
				return true;
			}
		}
		
		public void print() {
			for(Node p = head; p != null; p = p.getNext()) {
				System.out.print(p.getData()+" ");
			}
			System.out.println();
		}
}
