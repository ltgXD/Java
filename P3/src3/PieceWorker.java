
public class PieceWorker extends Employee {
	private double salary;

	public void earnings(int quantity){
		this.salary=20*quantity;
		System.out.println("PieceWorker的工资计算结果为："+salary);
	}

}
