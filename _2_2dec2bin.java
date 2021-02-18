package REKURSIQ;

public class _2_2dec2bin {

	
	public static String dec2Bin(int value) {
		if(value==1) {
			return "1";
		}
		return dec2Bin(value / 2 ) + value % 2 ;
	}
	
	
	public static void main(String[] args) {
		System.out.print(dec2Bin(29) );
	}
}
