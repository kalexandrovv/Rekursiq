package REKURSIQ;

public class _1_3stepenNa2 {
	
	public static void main(String[] args) {
		System.out.println(rekursiq(5));
		System.out.println(iteraciq(5));
	}
	
	
	
	
	public static int rekursiq(int stepen) {
		if (stepen == 0 ) 
		return 1;
		
	return 2 * rekursiq(stepen - 1 );
	
	}
	
	
	public static int iteraciq(int stepen) {
		int chislo=1;
		while(stepen>0) {
			chislo*=2;
			stepen--;
		}
		return chislo;
	}
}


