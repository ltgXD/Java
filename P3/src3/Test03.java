
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
		pieceworker.earnings(2000);//�Ѳ�Ʒ�������㹤�ʣ�ÿ��20Ԫ
		hourlyworker.earnings(230);//�Թ���ʱ��Ϊ��λ�����㹤�ʣ�ÿСʱ200Ԫ
	}

}
