
public class P4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trianglele A=new Trianglele(1,2);
		Trianglele B=new Trianglele(5,3);
		Trianglele C=new Trianglele(6,2);
		Trianglele tr=new Trianglele();
		double c,s;
		c=tr.computec(tr.computeside(A.x, A.y, B.x, B.y, C.x, C.y));
		s=tr.computes(tr.computeside(A.x, A.y, B.x, B.y, C.x, C.y));
		System.out.println("三角形的周长为："+c);
		System.out.println("三角形的面积为："+s);
	}

}
