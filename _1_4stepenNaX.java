package REKURSIQ;

public class _1_4stepenNaX {

	public static void main(String[] args) {
		System.out.println(rekursiq(3,3));
		System.out.println(iteraciq(3,3));
	}
	
	
	
	
	public static int rekursiq(int osnova , int stepen) {
		if (stepen == 0 ) 
		return 1;
		
	return osnova * rekursiq( osnova , stepen - 1 );
	
	}
	
	
	public static int iteraciq(int osnova , int stepen) {
		int chislo=1;
		while(stepen>0) {
			chislo*=osnova;
			stepen--;
		}
		return chislo;
	}
}



