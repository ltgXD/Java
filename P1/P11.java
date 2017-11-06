public class P11 {
	 public static boolean isPrime(int data){
	  for(int i = 2; i<=data/2;i++)
	   if(data%i==0) return false;
	  return true;
	 }
	 public static void main(String[] args) {
	  int count = 0,sum = 0;
	  System.out.println("3-1000内最大的10个素数 ： ");
	  for(int i = 1000;i>=3;i--){
	   if(count==10) break;
	   if(isPrime(i)){
	    sum = sum + i;
	    count++;
	    System.out.print(i+",");
	   }
	  }
	  System.out.println("\n十个素数之和 ： " + sum);
	 }
}