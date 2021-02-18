package REKURSIQ;

public class _2_1evenOdd {
	public static boolean even(int number) {
		if(number==0) 
			return true;
		return even(number-2);
	}
	
	public static boolean odd(int number) {
		if(number==1) 
			return true;
		return odd(number-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(odd(5));
		System.out.println(even(544));
	}

}
