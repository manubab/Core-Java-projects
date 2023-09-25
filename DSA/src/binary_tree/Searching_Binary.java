package binary_tree;

// creating 
// inserting
// delete 


class Node1{
	char key;
	Node1 left;
	Node1 right;
	
	Node1(char key)
	{
		this.key=key;
		
	}
}

class BinarySolution
{
	Node1 root;
	
	void insertKey(char key)
	{
		root=insertTree(root, root.key);
		
	}
	Node1 insertTree(Node1 root,char key)
	{
		if(root==null)
		{
			root=new Node1(key);
			return root;
			
		}
		if(key<root.key)
		{
			root.left=insertTree(root.left,key);
		}else if(key>root.key)
		{
			root.right=insertTree(root.right,key);
			
		}
		return root;
	}
	
	void preorderedtraversal(Node1 root)
	{
		if(root!=null)
		{
			System.out.print(root.key+" ");
			preorderedtraversal(root.left);
			preorderedtraversal(root.right);
			
		} 
	}
}



public class Searching_Binary {
	
	public static void main(String[] args)
	{
		BinarySolution t1=new BinarySolution();
		
		t1.insertKey('C');
		t1.insertKey('I');
		t1.insertKey('B');
		t1.insertKey('G');
		t1.insertKey('A');
		
		t1.preorderedtraversal(t1.root);
		
	}

}

// advantages 

// Can represent data with some relationship;
// insertion and search are much more efficient

// disadvantage
 //sorting is difficult;

//not much flexible







