import java.util.*;
public class P7{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����꣺");
		System.out.print("�����£�");
		System.out.print("�����գ�");
		int year =sc.nextInt();
		int month =sc.nextInt();
		int day =sc.nextInt();
			if (month <=12 ) {//һ�����12����
				if (day<=31) {//һ�������31��
					System.out.println("�Ϸ�����");
				}
			}
		else {
			System.out.println("���ǺϷ�����");
		}
	}
	
}

