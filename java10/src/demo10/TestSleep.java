package demo10;

public class TestSleep extends Thread{
public void run() {
for(int i=1; i<=5; i++) {
	try {
		Thread.sleep(500);
		}
	catch(InterruptedException e) {
		System.out.println(e);}
	System.out.println(i);
}
}
public static void main(String[] args) {
	 TestSleep ts1 = new  TestSleep();
	 TestSleep ts2 = new  TestSleep();
	 TestSleep ts3 = new  TestSleep();
	 
	ts1.start();
	//ts2.start();
	//ts3.start();
		
	try {
		 ts1.join();
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	//ts1.start();
	ts2.start();
	ts3.start();
	
	// ts1.start(); // Sleep method // 0 0 0 1 1 1 2 2 2
	//ts2.start();  // Sleep method
	
	
	// ts1.run(); // only run method // 0 1 2 0 1 2
	//ts2.run();  // only run method
	
	
	// ts1.start();  // its throw exception
	// ts1.start();  // 0 1 2
}
}
