
public class YuanZhu extends Circle {
	private int h;
	public YuanZhu(int r,int h){
		super(r);
		this.h=h;
	}
	public void ZhuTiji(){
	System.out.println("Ô²ÖùÌå»ıÎª"+h*super.criclearea());
	}
}
