package threadinfo;

public class B extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
