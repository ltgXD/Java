import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      int x = input.nextInt();
	      if ( (x%4 == 0 && x%100!=0)|| x%400==0){
	    		  
	    	  System.out.println("是闰年");}
	    	  else{
	    		    
	    		  
	    	  System.out.println("不是闰年");}

	}
}