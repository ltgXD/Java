
public class P7 {

	public static void main(String[] args) {
	
		Student A=new Student("01","Сһ","��",21,83);
		Student B=new Student("02","С��","��",22,94);
		Student C=new Student("03","С��","��",22,82);
		Student D=new Student("04","С��","Ů",21,61.5);
		Student E=new Student("05","С��","��",23,75);
		Student stu=new Student();
		System.out.println("ѧ����ϢΪ��");
		System.out.println(A.toString(A.sNo, A.sName, A.sSex, A.sAge, A.sJava));
		System.out.println("------------------");
		System.out.println(B.toString(B.sNo, B.sName, B.sSex, B.sAge, B.sJava));
		System.out.println("------------------");
		System.out.println(C.toString(C.sNo, C.sName, C.sSex, C.sAge, C.sJava));
		System.out.println("------------------");
		System.out.println(D.toString(D.sNo, D.sName, D.sSex, D.sAge, D.sJava));
		System.out.println("------------------");
		System.out.println(E.toString(E.sNo, E.sName, E.sSex, E.sAge, E.sJava));
		System.out.println();
		System.out.println("����˵�ƽ���ɼ�Ϊ��"+stu.average(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
		
		System.out.println("����˵���߳ɼ�Ϊ��"+stu.maxinum(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
		System.out.println("����˵���ͳɼ�Ϊ��"+stu.mininum(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
	}

}
