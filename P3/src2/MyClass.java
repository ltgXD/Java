
public class MyClass {
	public int data;
	MyClass(int data){
		this.data=data;
	}
	public void getData(){
		System.out.println("���Ǹ����е�getData����������ֵΪ��"+data);
		//return data;
	}
	public void setData(int data){
		this.data=data;
		System.out.println("���Ǹ����е�setData������������ֵΪ��"+data);
	}
}
