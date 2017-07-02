
public class EquationBinaryTree {
	private EquationBinaryTreeNode root;
	public EquationBinaryTree()
	{
		root = null;
	}

	/*
	 * Populate from infix
	 */
	public void populateFromInfix(String inf)
	{
		inf = inf.replaceAll(" ", "");//clean up extra spaces
		root = populateFromInfixHelper(inf);
	}
	private EquationBinaryTreeNode populateFromInfixHelper(String inf)
	{
		if(inf.length() == 1)
		{
			return new EquationBinaryTreeNode(inf.charAt(0));
		}
		String[] pieces = infixBreakdownHelper(inf);
		EquationBinaryTreeNode node = new EquationBinaryTreeNode(pieces[1].charAt(0));;
		node.left = populateFromInfixHelper(pieces[0]);
		node.right = populateFromInfixHelper(pieces[2]);
		return node;
	}
	private String[] infixBreakdownHelper(String inf)
	{
		String[] pieces = new String[3];
		if(inf.length() >= 5)
		{
			inf = inf.substring(1,inf.length()-1);
			int count = 0;
			int mid = 0;
			for(int i = 0; i < inf.length(); i++)
			{
				if(inf.charAt(i) == '(')
					count++;
				else if(inf.charAt(i) == ')')
					count--;
				if(count == 0)
				{
					mid = i+1;
					break;
				}
			}
			pieces[0] = inf.substring(0,mid);
			pieces[1] = ""+inf.charAt(mid);
			pieces[2] = inf.substring(mid+1);
		}
		return pieces;
	}
	/*
	 * Populate from prefix
	 */
	public void populateFromPrefix(String pre)
	{
	}
	/*
	 * Populate from postfix
	 */
	public void populateFromPostfix(String post)
	{
	}

	/*
	 * Print Infix
	 */
	public String toInfix()
	{
		return toInfixHelper(root);
	}
	private String toInfixHelper(EquationBinaryTreeNode node)
	{
		String output = "";
		if(node.left != null)
			output += "(" +toInfixHelper(node.left);
		output += node.value;
		if(node.right != null)
			output += toInfixHelper(node.right)+")";
		return output;
	}
	/*
	 * Print Postfix
	 */
	public String toPostfix()
	{
		return toPostfixHelper(root);
	}
	private String toPostfixHelper(EquationBinaryTreeNode node)
	{
		String output = "";
		if(node.left != null)
			output += toPostfixHelper(node.left);
		if(node.right != null)
			output += toPostfixHelper(node.right);
		output += node.value;
		return output;
	}

	/*
	 * Print Prefix
	 */
	public String toPrefix()
	{
		return toPrefixHelper(root);
	}
	private String toPrefixHelper(EquationBinaryTreeNode node)
	{
		String output = "";
		output += node.value;
		if(node.left != null)
			output += toPrefixHelper(node.left);
		if(node.right != null)
			output += toPrefixHelper(node.right);

		return output;
	}
	public class EquationBinaryTreeNode{
		EquationBinaryTreeNode left, right;
		char value;
		public EquationBinaryTreeNode(char v)
		{
			left = null;
			right = null;
			value = v;
		}
		public String toString()
		{
			return ""+value;
		}
	}
}
