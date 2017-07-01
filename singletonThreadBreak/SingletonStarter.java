package singletonThreadBreak;

public class SingletonStarter implements Runnable{
	@Override
	public void run() {
		System.out.println(MySingleton.getInstance().hashCode());

	}
}
