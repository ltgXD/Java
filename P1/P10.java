public class P10 {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int i, j,n,l =0, max;
		boolean f= false;
		
		for(i=0; i<3; i++) {
			max = arr[i][0];
			for(j=0; j<3; j++) {
				if(max<arr[i][j]) { 
					max = arr[i][j];
					l = j;		
			}
			
		}
			for(n=0; n<3;n++) {
				if(max>arr[n][l]) {
					break;
				}
			}
			if(n==3) {
				System.out.println("鞍点是：" + "arr[" + i + "]" + "[" + l + "]值为"+max);
				f = true;
			}
	}
		if(f!=true) {
			System.out.println("不存在鞍点");
		}
		
}
}