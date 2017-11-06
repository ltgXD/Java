
public class Trianglele {
	double x,y;
	public Trianglele(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public Trianglele()
	{
		
	}
	double[] computeside(double a,double b,double c,double d,double e,double f)
	{
		double temp1,temp2,temp3;
		double[] Array=new double[3];
		temp1=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
		temp2=Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
		temp3=Math.sqrt((c-e)*(c-e)+(d-f)*(d-f));
		Array[0]=temp1;
		Array[1]=temp2;
		Array[2]=temp3;
		return Array;
	}
	double computec(double[] Array)
	{
		double c;
		c=(Array[0]+Array[1]+Array[2]);
		return c;
	}
	double computes(double[] Array)
	{
		double q,s;
		q=(Array[0]+Array[1]+Array[2])/2;
		s=Math.sqrt(q*(q-Array[0])*(q-Array[1])*(q-Array[2]));
		return s;
	}
}
