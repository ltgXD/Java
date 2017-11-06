
public class Student {
	String sNo,sName,sSex;
	int sAge;
	double sJava;
	public Student(String no,String name,String sex,int age,double java)
	{
		this.sNo=no;
		this.sName=name;
		this.sSex=sex;
		this.sAge=age;
		this.sJava=java;
	}
	public Student()
	{
		
	}
	public String getNo()
	{
		return sNo;
	}
	public String getName()
	{
		return sName;
	}
	public String getSex()
	{
		return sSex;
	}
	public int getAge()
	{
		return sAge;
	}
	public double getJava()
	{
		return sJava;
	}
	public String toString(String no,String name,String sex,int age,double java)
	{
		String str;
		str="学号："+no+"\n姓名："+name+"\n性别："+sex+"\n年龄："+age+"\nJava成绩："+java;
		return str;
	}
	double average(double a,double b,double c,double d,double e)
	{
		double av;
		av=(a+b+c+d+e)/5;
		return av;
	}
	double maxinum(double a,double b,double c,double d,double e)
	{
		double max;
		double[] Array=new double[5];
		Array[0]=a;
		Array[1]=b;
		Array[2]=c;
		Array[3]=d;
		Array[4]=e;
		max=Array[0];
		for(int i=0;i<5;i++)
		{
			if(i==4)
			{
				break;
			}
			if(Array[i]<Array[i+1])
			{
				max=Array[i+1];
			}
		}
		return max;
	}
	double mininum(double a,double b,double c,double d,double e)
	{
		double min;
		double[] Array=new double[5];
		Array[0]=a;
		Array[1]=b;
		Array[2]=c;
		Array[3]=d;
		Array[4]=e;
		min=Array[0];
		for(int i=0;i<5;i++)
		{
			if(i==4)
			{
				break;
			}
			if(Array[i]>Array[i+1])
			{
				min=Array[i+1];
			}
		}
		return min;
	}
}
