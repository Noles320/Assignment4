

//Generic type must be comparable on the same type
public class LazyDeleteSearchTree<E extends Comparable<? super E>> {

	private BinaryNode<E> root;
	public LazyDeleteSearchTree()
	{
		root = null;
	}

	public void makeEmpty()
	{
		root = null;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	public E contains(E val)
	{
		return contains(val, root);
	}
	public void identicalTrees(MyBinarySearchTree <E> e2){
		
		
	}
	private E contains(E val, BinaryNode<E> curr)
	{
		if(curr == null)
			return null;

		int comparison = val.compareTo(curr.val);

		if(comparison < 0)//item is smaller than current
		{
			return contains(val, curr.left);
		}
		else if(comparison > 0)
		{
			return contains(val, curr.right);
		}
		else
		{
			return curr.val;
		}
	}
	public E findMin()
	{
		if(isEmpty())
			return null;
		else
			return findMin(root).val;
	}
	private BinaryNode<E> findMin(BinaryNode<E> curr)
	{
		if(curr == null)
			return null;
		return findMin(curr.left);
	}
	public E findMax()
	{
		if(isEmpty())
			return null;
		else
			return findMax(root).val;
	}
	private BinaryNode<E> findMax(BinaryNode<E> curr)
	{
		if(curr == null)
			return null;
		return findMax(curr.right);
	}
	public void printTree(BinaryNode<E> curr){
		if (curr != null)
		{ printTree(curr.left);
		  printTree(curr.right);
		}
	}
	public void update(E val)
	{
		insert(val);
	}
	public void insert(E val)
	{
		root = insert(val, root);
	}
	private BinaryNode<E> insert(E val, BinaryNode<E> curr)
	{
		if(curr == null)
			return new BinaryNode<E>(val);

		int comparison = val.compareTo(curr.val);

		if(comparison < 0)//item is smaller than current
		{
			curr.left = insert(val, curr.left);
		}
		else if(comparison > 0)
		{
			curr.right = insert(val, curr.right);
		}
		else
		{
			curr.val = val;
		}
		return curr;
	}
	public void remove(E val)
	{
		root = remove(val, root);
	}
	private BinaryNode<E> remove(E val, BinaryNode<E> curr)
	{
		if(curr == null)//not found
			return curr;

		int comparison = val.compareTo(curr.val);

		if(comparison < 0)//item is smaller than current
		{
			curr.left = remove(val, curr.left);
		}
		else if(comparison > 0)
		{
			curr.right = remove(val, curr.right);
		}
		else if(curr.left != null && curr.right != null)//two children
		{
			curr.val = findMin(curr.right).val;
			curr.right = remove(curr.val, curr.right);
		}
		else
		{
			curr = (curr.left != null) ? curr.left : curr.right;
		}
		return curr;
	}

	private class BinaryNode<E>
	{
		E val;
		BinaryNode<E> left, right;//left = smaller, right = greater
		public BinaryNode(E val)
		{
			this.val = val;
			left = null;
			right = null;
		}
		public String toString()
		{
			return val.toString();
		}
	}
}
