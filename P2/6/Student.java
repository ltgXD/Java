
public class Student {
	String no;
	String name;
	String sex;
	int age;
	public boolean HaveClass()
	{
		return false;
	}
	public boolean sleep()
	{
		return true;
	}
	public String toString(boolean a,boolean b)
	{
		String str;
		str="ѧ�ţ�"+no+"\n������"+name+"\n�Ա�"+"\n���䣺"+age+"\nsleep()="+a+"\nHaveClass()="+b;
		return str;
	}
}
