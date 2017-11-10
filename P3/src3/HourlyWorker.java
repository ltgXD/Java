
public class HourlyWorker extends Employee {
	private double salary;

	public void earnings(int data){
		this.salary=200*data;
		System.out.println("HourlyWorker的工资计算结果为："+salary);
	}
}
