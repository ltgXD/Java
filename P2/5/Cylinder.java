
public class Cylinder {
	int r,h;
	double p=3.14;
	public Cylinder(int r,int h)
	{
		this.r=r;
		this.h=h;
	}
	public Cylinder()
	{
		
	}
	double computes(int r,int h)
	{
		double c,s;
		c=2*p*r;
		s=c*h+2*p*r*r;
		return s;
	}
	double computev(int r,int h)
	{
		double v;
		v=p*r*r*h;
		return v;
	}
}
