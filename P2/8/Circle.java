
public class Circle {
	int r;
	static double p=3.14;
	int x,y;
	Circle(int x,int y,int r){
		this.x=x;
		this.y=y;
		this.r=r;
		
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	void yuanxin(int m,int n){
		x=m;
		y=n;
	}
	void banjing(int z){
		r=z;
		
	}
	void zz(){
		System.out.println("Բ��x������Ϊ:"+x+"Բ��y������Ϊ:"+y);
		System.out.println("�뾶:"+r);
	}
	

}
