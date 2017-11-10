
public class MyClass {
	public int data;
	MyClass(int data){
		this.data=data;
	}
	public void getData(){
		System.out.println("这是父类中的getData（）方法，值为："+data);
		//return data;
	}
	public void setData(int data){
		this.data=data;
		System.out.println("这是父类中的setData（）方法，改值为："+data);
	}
}
