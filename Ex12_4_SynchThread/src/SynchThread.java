class SObject {
	int sum = 0;
	synchronized void add() {
		int n = sum;
		Thread.currentThread().yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ":" + sum);
	}
	int getSum() { return sum; }
}
class WorkerThread extends Thread {
	SObject sObj;
	WorkerThread(String name, SObject sObj) {
		super(name);
		this.sObj = sObj;
	}
	public void run() {
		int i=0;
		while(i<10) {
			try {
				sleep(1);
			}
			catch(InterruptedException e) {
				return;
			}
			sObj.add();
			i++;
		}
	}
}
public class SynchThread {
	public static void main(String[] argv) {
		SObject obj = new SObject();
		Thread th1 = new WorkerThread("kang", obj);
		Thread th2 = new WorkerThread("kim", obj);
		th1.start();
		th2.start();
	}
}
