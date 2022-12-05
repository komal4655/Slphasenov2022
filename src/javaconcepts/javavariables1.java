package javaconcepts;


public class javavariables1 {
	
	int i = 17; //this is called an instance variable. Declared/initialized inside a class and 
	// outside a method
	static String str1 = "learning java";  //variable declared with static keyword is called a static 
    int[] arr = { 2, 5, 7, 9 };
	
	int add(int a, int b) { // local variable : variable declared inside a method is called local variables
	    return a + b;
	}
	
		
 	public void main1(String[] args) {
		System.out.println("hi how are you .... display is getting executed"); 

	}
 	
 	public static void main(String[] args) {
   javavariables1 obj = new javavariables1();
   
   System.out.println(obj.i);
   System.out.println(obj.add(4,  8));
   System.out.println(str1);
   }
 	
}
 	
 