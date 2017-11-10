
public class Test02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass db=new SubClass(10);
		db.getMydata();
		db.getData();
		db.setMydata(5);//更改子类的值，父类没有变化
		db.getData();
		db.setMydata(10);
		db.setData(5);
		db.getMydata();
	}

}
