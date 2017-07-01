package singletonThreadBreak;

import singletonBreak_CloneReflectionSerilization.MySingleTon;

public class MySingleton {
	private static MySingleton oldSingleton;
	// No Easy initialization
	//Thread safety problem
		/**
		 * Create a static method to get instance.
		 * Solution of Thread safety problem:- Make it Synchronized, This way we force every thread to wait until its turn before it executes. 
		 * I.e. no two threads can be entered into getInstance() method at the same time.
		 * Synchronized methods are expensive and will have serious performance hit. 
		 * Check If instance is already created,method not to check for synchronization. (Double-Checked Locking)
		 */
	public static MySingleton getInstance() {
		if (oldSingleton == null) {
			synchronized (MySingleton.class) {
				if (oldSingleton == null) {
					oldSingleton = new MySingleton();
				}
			}
		}
		return oldSingleton;
	}

	private MySingleton() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
