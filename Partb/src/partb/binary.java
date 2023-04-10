package partb;
class Node1{
	Node1 left;
	Node1 right;
	int data;
}
class binarytree2{
	public int getdifevenodd(Node1 node) {
		if(node == null )
		{
			return 0;
		}
		return node.data-getdifevenodd(node.left)-getdifevenodd(node.right);
	}
	public Node1 createnode(int val) {
		Node1 newnode=new Node1();
		newnode.data=val;
		newnode.left=null;
		newnode.right=null;
		return newnode;
	}
}
public class binary {
	public static void main(String[] args) {
		  binarytree2 a = new binarytree2();
		  Node1 root=a.createnode(1);
		  root.left=a.createnode(2);
		  root.right=a.createnode(3);
		  
		  System.out.println("the sum is :" + a.getdifevenodd(root));
		  
	  }

}
