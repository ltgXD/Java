
public class YuanZhui extends Circle {
	private int h;
	public YuanZhui(int r,int h){
		super(r);
		this.h=h;
	}
	public void ZhuiTiji(){
	System.out.println("Բ׶���Ϊ"+h*super.criclearea()/3);
	}
}
