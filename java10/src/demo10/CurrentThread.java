package demo10;

public class CurrentThread extends Thread{

 public void run() {
	 //System.out.println(Thread.currentThread().getPriority());
	 System.out.println(Thread.currentThread().getName());
	 //System.out.println(Thread.currentThread().getPriority());
	// System.out.println("Running");
 }
public static void main(String[] args) {
	CurrentThread ct1 = new CurrentThread();
	CurrentThread ct2 = new CurrentThread();
	CurrentThread ct3 = new CurrentThread();
	ct2.setPriority(MAX_PRIORITY);
	ct1.setPriority(MIN_PRIORITY);
	ct3.setPriority(NORM_PRIORITY);
	
	ct1.start();
	ct1.setName("hai hello");
	//System.out.println("Changing ct1: "+ct1.getName());
	System.out.println("min priority:" +ct1.getPriority());
	
	ct2.start();
	ct2.setName("hello priya");
	//System.out.println("Changing ct2: "+ct2.getName());
	System.out.println("max priority:" +ct2.getPriority());
	ct3.start();
	ct3.setName("Welcome");
	System.out.println("norm priority:" +ct3.getPriority());
	//System.out.println("Changing ct3: "+ct3.getName());
	//ct1.setName("hai");
	//ct2.setName("hello");
	//System.out.println("Changing ct1: "+ct1.getName());
}
}