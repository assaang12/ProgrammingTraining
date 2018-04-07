
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NodeSet nd = new NodeSet();
		
			for(int i = 1; i <= 100; i++) {
				nd.add(i);
			}
			
			nd.print();
			nd.evenRemove();
			nd.print();
			
	}

}
