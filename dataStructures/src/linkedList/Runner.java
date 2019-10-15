package linkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(12);
		list.insert(7);
		list.insertAtStart(0);
		list.insertAt(0, 90);
		list.show();
		list.deleteAt(0);
		System.out.println("-----");
		list.show();
		list.deleteAt(2);
		System.out.println("-----");
		list.show();
	}

}
