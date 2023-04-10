package partb;
class Node{
	Node left;
	Node right;
	int data;
}

class binarytree{
	public int getdif(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.data-getdif(node.left)-getdif(node.right);
	}
	public Node createNode(int val)
	{
		Node newnode=new Node();
		newnode.data=val;
		newnode.right=null;
		newnode.left=null;
		return newnode;
	}
	
}


public class diffevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree a=new binarytree();
		Node root=a.createNode(10);
		root.left=a.createNode(30);
		root.right=a.createNode(50);
		System.out.println("the sum is :" + a.getdif(root));
		
		

	}

}
