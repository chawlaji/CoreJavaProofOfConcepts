package singletonThreadBreak;

public class Client {
	public static void main(String[] args) {
		for (int ii = 0; ii < 10; ii++) {
			new Thread(new SingletonStarter()).start();
		}
	}
}
