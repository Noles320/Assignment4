import java.util.TreeMap;
import java.util.TreeSet;

public class SetMapExamples {

	public static void main(String[] args) {
		TreeSet<Integer> tree1 = new TreeSet<>();
		tree1.add(4);
		tree1.add(5);
		tree1.add(2);
		tree1.add(3);
		tree1.add(1);
		tree1.add(1);
		for(Integer t : tree1)
		{
			System.out.println(t);
		}
		System.out.println("Tree Map");
		TreeMap<String, Integer> tree2 = new TreeMap<>();
		tree2.put("One",1);
		tree2.put("Two",2);
		tree2.put("three",3);
		tree2.put("four",4);
		tree2.put("Bob",4);
		tree2.put("Bob",3);
		System.out.println(tree2.get("three"));
		for(String k : tree2.keySet())
		{
			System.out.println("Key:"+k + ": Value:" + tree2.get(k));
		}
	}

}
