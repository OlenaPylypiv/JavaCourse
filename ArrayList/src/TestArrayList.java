
import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {

	private ArrayList<String> al;
	
	public static void main(String[] args) {
		TestArrayList test = new TestArrayList();
		test.create();
		test.getData();
		test.iterateData();
	}

	private void create() {
		al = new ArrayList<String>();

		al.add("olena");
		al.add("lol");
		al.add("hello");
	}
	private void getData() {
		for(int i = 0;i < al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
	}
	private void iterateData() {
		ListIterator<String> it = al.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
