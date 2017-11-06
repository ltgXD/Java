
public class P9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		int o=0; 
		int p=0; 
		int a=0;
		for (i=100; i<=999; i++){
			o=i%10;
			p=(i/10)%10;
			a=i/100;
			if (i==(o*o*o+p*p*p+a*a*a))
				System.out.println(i);
			
		}
	}
}