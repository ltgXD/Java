
public class Trianglele {
	double[] setTri()
	{
		double temp1,temp2,temp3;
		double[] Array=new double[3];
		Point A=new Point();
		Point B=new Point();
		Point C=new Point();
		A.x=1;
		A.y=2;
		B.x=5;	
		B.y=3;
		C.x=6;
		C.y=2;
		temp1=Math.sqrt((A.x-B.x)*(A.x-B.x)+(A.y-B.y)*(A.y-B.y));
		temp2=Math.sqrt((A.x-C.x)*(A.x-C.x)+(A.y-C.y)*(A.y-C.y));
		temp3=Math.sqrt((B.x-C.x)*(B.x-C.x)+(B.y-C.y)*(B.y-C.y));
		Array[0]=temp1;
		Array[1]=temp2;
		Array[2]=temp3;
		return Array;
	}
	double computec(double Array[])
	{
		double c;
		c=(Array[0]+Array[1]+Array[2]);
		return c;
	}
	double computes(double Array[])
	{
		double q,s;
		q=(Array[0]+Array[1]+Array[2])/2;
		s=Math.sqrt(q*(q-Array[0])*(q-Array[1])*(q-Array[2]));
		return s;
	}
}
