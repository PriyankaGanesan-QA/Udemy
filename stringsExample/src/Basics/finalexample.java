package Basics;

public class finalexample {
	
	//final keyword example
	//final int a=10
	int a= 10;
	
	void display() {
		 a++;
		 System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finalexample a = new finalexample();
		a.display();
		
		  
		  
		String main_string = "PriyankaGanesan";
		 System.out.println(main_string.length());
	    System.out.println(main_string.substring(0, main_string.length()-7));	
	    System.out.println(main_string.length()-1);	
		  
	

}

	}
