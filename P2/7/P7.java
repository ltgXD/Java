
public class P7 {

	public static void main(String[] args) {
	
		Student A=new Student("01","小一","男",21,83);
		Student B=new Student("02","小二","男",22,94);
		Student C=new Student("03","小三","男",22,82);
		Student D=new Student("04","小四","女",21,61.5);
		Student E=new Student("05","小五","男",23,75);
		Student stu=new Student();
		System.out.println("学生信息为：");
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
		System.out.println("五个人的平均成绩为："+stu.average(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
		
		System.out.println("五个人的最高成绩为："+stu.maxinum(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
		System.out.println("五个人的最低成绩为："+stu.mininum(A.sJava, B.sJava, C.sJava, D.sJava, E.sJava));
	}

}
