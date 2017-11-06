import java.util.*;
public class P7{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("输入年：");
		System.out.print("输入月：");
		System.out.print("输入日：");
		int year =sc.nextInt();
		int month =sc.nextInt();
		int day =sc.nextInt();
			if (month <=12 ) {//一年最多12个月
				if (day<=31) {//一个月最多31天
					System.out.println("合法日期");
				}
			}
		else {
			System.out.println("不是合法日期");
		}
	}
	
}

