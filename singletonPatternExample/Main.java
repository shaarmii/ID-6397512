package singletonPatternExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		System.out.println(l1);
		System.out.println(l1);
		System.out.println(l1 == l2);
		
		

	}

}
