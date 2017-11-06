
public class P5 {

	public static void main(String[] args) {

		Cylinder cy=new Cylinder(10,5);
		Cylinder a=new Cylinder();
		double s,v;
		s=a.computes(cy.r, cy.h);
		v=a.computev(cy.r, cy.h);
		System.out.println("圆柱体的表面积为："+s);
		System.out.println("圆柱体的体积为："+v);
	}

}
