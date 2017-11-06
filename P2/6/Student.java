
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
		str="学号："+no+"\n姓名："+name+"\n性别："+"\n年龄："+age+"\nsleep()="+a+"\nHaveClass()="+b;
		return str;
	}
}
