package javaconcepts;

public class ControlstatementIfElse {
	int a = 43;
	
	int Mul(int i , int j) {
		return i*j;
	}

	public static void main(String[] args) {
	
		ControlstatementIfElse obj = new ControlstatementIfElse();
		int result = obj.Mul(6, 3);
		if (result>14) { 
			System.out.println("output: "+result +" is greater than 12, condition satisfied");
		}else {		
		System.out.println("condition is not satisfied");
	}
		
	}
	
} 


	
	
