
public class EquationBinaryTreeTester {

	public static void main(String[] args) {
		EquationBinaryTree tree = new EquationBinaryTree();
		tree.populateFromInfix("((a+(b*c))+(((d*e)+f)*g))");
		System.out.println(tree.toInfix());
		System.out.println(tree.toPostfix());
		System.out.println(tree.toPrefix());
	}

}
