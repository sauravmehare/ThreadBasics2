
public class Main {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main " + i);
		}
		A a = new A();
		B b = new B();

		//We can just set priority but it is not guarantee it will work
		Thread th1 = new Thread(a); //A
		th1.setPriority(1);// low priority
		
		Thread th2 = new Thread(b); //B
		th2.setPriority(10); //high priority
		th1.start();
		th2.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main2 " + i);
		}

	}

}
