
public class Boss extends Employee {
	private double salary;
	public Boss(double salary){
		this.salary=salary;
	}
	public void earnings(){
		System.out.println("Boss的工资计算结果为："+salary);
	}
}
