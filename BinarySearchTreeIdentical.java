
public class BinarySearchTreeIdentical {

	public static void main(String[] args) {
	
		MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
		MyBinarySearchTree<Integer> tree2 = new MyBinarySearchTree<>();
		tree.update(4);
		tree.update(9);
		
		tree2.insert(5);
		tree2.insert(4);
		tree2.insert(9);
		
		System.out.println(tree);
		
		for(Integer t : tree)
		{
			System.out.println(t);
		}
	}

}
