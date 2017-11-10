
public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss boss=new Boss(60000.0);
		PieceWorker pieceworker=new PieceWorker();
		HourlyWorker hourlyworker=new HourlyWorker();
		boss.earnings();
		pieceworker.earnings(2000);//已产品数量计算工资，每个20元
		hourlyworker.earnings(230);//以工作时间为单位，计算工资，每小时200元
	}

}
