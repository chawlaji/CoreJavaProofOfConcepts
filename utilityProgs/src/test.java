
public class test {

	// case 1
	public test(Object ob) {
		System.out.println("ob");
	}

	public test(String ob) {
		System.out.println("string");
	}

	// case 1+2
	/*
	 * public test(Integer ob) { System.out.println("string"); } 
	 * //or 
	 * public test(Boolean ob) { System.out.println("string"); }
	 *
	 */

	// case 1+3
	public test(int ob) {
		System.out.println("string");
	}

}
