package REKURSIQ;

public class _1_1sborDoN {
	
	
	public static void main(String[] args) {
		System.out.println("Sum is " + chislo(5) );
	}
	public static int chislo(int n) {
	  	 int chislaDobavqne=1;
	  	 int obshto=0;
	  	 while(chislaDobavqne<=n) {
	  		obshto+=chislaDobavqne;
	  		chislaDobavqne++;
	  	 }
	  	 return obshto;
	}
	
}
