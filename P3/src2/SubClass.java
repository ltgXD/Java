
public class SubClass extends MyClass {
	public int Mydata;
	SubClass(int Mydata){
		super(Mydata);
		this.Mydata=Mydata;
	}
	public void getMydata(){
		System.out.println("这是子类中的getMydata（）方法，值为："+Mydata);
		//return Mydata;
	}
	public void setMydata(int Mydata){
		this.Mydata=Mydata;
		System.out.println("这是子类中的setMydata（）方法，改值为："+Mydata);
	}
}
