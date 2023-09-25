package binary_tree;

class Node
{
	char  key;
	Node left,right;
	
	Node(char key)
	{
		this.key=key;
	}
}

class TreTraversal
{
	Node root;
	
	void preOrderedTraversal(Node n)
	{
		if(n!=null)
		{
			System.out.print(n.key+" ");
			preOrderedTraversal(n.left);
			preOrderedTraversal(n.right);
		}
		
		
	}
	void inOrderedTraversal(Node n)
	{
		if(n!=null)
		{
			
			preOrderedTraversal(n.left);
			System.out.print(n.key+" ");
			preOrderedTraversal(n.right);
		}
		
		
	}
	void postOrderedTraversal(Node n)
	{
		if(n!=null)
		{
			
			preOrderedTraversal(n.left);
			preOrderedTraversal(n.right);
			System.out.print(n.key+" ");
			
		}
		
		
	}
	
}


public class T_binary_tree {
	
	public static void main(String[] args) {
		
		TreTraversal t1=new TreTraversal();
		
		t1.root=new Node('A');
		t1.root.left=new Node('B');
		t1.root.right=new Node('c');
		t1.root.left.left=new Node('D');
		t1.root.right.right=new Node('E');
		
		
		t1.preOrderedTraversal(t1.root);
		System.out.println();
		t1.inOrderedTraversal(t1.root);
		System.out.println();
		t1.postOrderedTraversal(t1.root);
		
		
	}

}


  // advantages 

// can represent data with some relationship
// insertion and search are much more efficient

  // disadvantages

// Sorting
// not much flexible;


 







