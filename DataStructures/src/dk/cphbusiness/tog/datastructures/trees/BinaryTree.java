package dk.cphbusiness.tog.datastructures.trees;

public class BinaryTree
{
	private BinaryTreeNode root;

	public BinaryTree()
	{
		root = null;
	}

	public void add(int data)
	{
		root = insertInto(data, root, null);
	}

	public void print()
	{
		printNode(root);
	}

	private void printNode(BinaryTreeNode node)
	{
		if(node == null)
		{
			return;
		}
		printNode(node.getLeftChild());
		System.out.println(node.getData());
		printNode(node.getRightChild());
	}

	private BinaryTreeNode insertInto(int data, BinaryTreeNode node, BinaryTreeNode parent)
	{
		if(node == null)
		{
			return new BinaryTreeNode(data, parent, null, null);
		}
		if(data == node.getData())
		{
			return node;
		}
		if(data < node.getData())
		{
			BinaryTreeNode leftChild = insertInto(data, node.getLeftChild(), node);
			node.setLeftChild(leftChild);
			return node;
		}
		else
		{
			BinaryTreeNode rightChild = insertInto(data, node.getRightChild(), node);
			node.setRightChild(rightChild);
			return node;
		}
	}
}
