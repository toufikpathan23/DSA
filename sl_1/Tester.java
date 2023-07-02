package sl_1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1=new LinkedList();
		
		l1.display();
		
		l1.insert("Toufik");
		l1.insert("Souarabh");
		l1.insert("Mandar");
		l1.insert("Amit",2);
		
		l1.display();
		
		//l1.delete(3);
		
		System.out.println("=========================");
		
		/*
		 * l1.insert("Toufik"); l1.insert("Sourabh");
		 */
		
		l1.display();
		
		System.out.println("=========================");
	    l1.reverse();
	    
	    l1.display();
		
	}

}
