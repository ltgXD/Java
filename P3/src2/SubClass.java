
public class SubClass extends MyClass {
	public int Mydata;
	SubClass(int Mydata){
		super(Mydata);
		this.Mydata=Mydata;
	}
	public void getMydata(){
		System.out.println("���������е�getMydata����������ֵΪ��"+Mydata);
		//return Mydata;
	}
	public void setMydata(int Mydata){
		this.Mydata=Mydata;
		System.out.println("���������е�setMydata������������ֵΪ��"+Mydata);
	}
}
