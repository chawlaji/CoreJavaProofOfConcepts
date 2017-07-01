package singletonBreak_CloneReflectionSerilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class MySingleTon implements Serializable, Cloneable {
//Serialization
	//private static MySingleTon myObj = new MySingleTon();

	private static MySingleTon myObj = new MySingleTon();
	/**
	 * Create private constructor
	 * Private Constructor prevents any other class from instantiating 
	 */
	private MySingleTon() {
	  //Prevent reflection(prevents creation of object if an object already present)
		if (myObj != null) {
	           throw new IllegalStateException("Singleton" +" instance already created.");
	        }
		//System.out.println("Hashcode :"+this.hashCode());
	}
	
	public static MySingleTon getInstance() {
		/* Lazy initialization, creating object on first use */
		if (myObj == null) {
			myObj = new MySingleTon();
		}
		return myObj;
	}

	public Runnable getSomeThing() {
		// if hashcodes are same that means Singleton class is implemented correctly
		System.out.println("the current object hashcode is..." + this.hashCode() );
		return null;
	}

	/* Prevent cloning */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return myObj;
	}

	/* Prevent Multiple object via Serialization */
	protected Object readResolve() {
		return myObj;
	}


	public static void main(String a[]) throws CloneNotSupportedException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException {

		/**Singleton breaking test cases**/
		
		// factory method(Default)
		
		MySingleTon st = MySingleTon.getInstance();
		System.out.println("first original object");
		st.getSomeThing();

		// cloning
		
		MySingleTon st2 = (MySingleTon) st.clone();
		System.out.println(" ");
		System.out.println("Cloning");
		st2.getSomeThing();

		
		// serilaization/deserilization
		
		// serailize from file to object
			MySingleTon instance1 = MySingleTon.myObj;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));

			MySingleTon instance2 = (MySingleTon) in.readObject();
			in.close();
			System.out.println(" ");
			System.out.println("serilaization/deserilization :-");
			System.out.println("instance1 object hashcode is... " + instance1.hashCode());
			System.out.println("instance2 object hashcode is..." + instance2.hashCode());
		


		// thread
		
		/** SingletonThreadBreak**/
		
		// reflection
		System.out.println(" ");
		System.out.println("reflection");
				MySingleTon stbRef = null;
				Class<?> c = Class.forName("utilityProgs.MySingleTon");
				stbRef = (MySingleTon) c.newInstance();
				stbRef.getSomeThing();
				

		
	}
}