import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BinarySearchTree {
	public static Node root;
	Node parent;
	
	BinarySearchTree()
	{
		root=null;
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree= new BinarySearchTree();
		tree.insert(35, 4.5);
		tree.insert(45,3.5);
		tree.insert(15,5.5);
		tree.insert(55,6.7);
		tree.insert(25,1.5);
		tree.insert(11,1.5);
		tree.insert(37,1.5);
		tree.insert(85,4.5);
		tree.insert(57,7.5);
		printRightBottomUp(root);
		System.out.println("Print tree : ==");
		byLevel(root);
		
	Node a=	invertTree(root);
	System.out.println("print in reverse");
	byLevel(a);
	//	boolean isflag=isBalanced(tree.root);
		//System.out.println("Tree is balanced" + isflag);
	
	
	
	
	
	/*	Node find=tree.Find(35);
		System.out.println(find.data);
		System.out.println("sorted In order");
		tree.inorderTraversal(root);
		System.out.println("sorted Pre Order");
		tree.preOrderTraversal(root);
		System.out.println("sorted Post Order");
		tree.postOrderTraversal(root);
		System.out.println("After Delete");
		tree.delete(37);
		tree.inorderTraversal(tree.root);*/
		
		
		
	}
	public static Node invertTree(Node root) {
	    if(root!=null){
	        helper(root);
	    }
	 
	    return root;    
	}
	 
	public static void helper(Node p){
	 
	    Node temp = p.leftChild;
	    p.leftChild = p.rightChild;
	    p.rightChild = temp;
	 
	    if(p.leftChild!=null)
	        helper(p.leftChild);
	 
	    if(p.rightChild!=null)
	        helper(p.rightChild);
	}
	
	public void insert(int input1, double input2)
	{
		
	  Node newNode= new Node();
	  newNode.data=input1;
	  newNode.ddata=input2;
	 // Node parent;
	  if(root==null)
	  {
		  root=newNode;
	  }
	  else
	  { Node current=root;
	  Node parent1;
		  
		  while(true)
		  {
			  parent1=current;
		  if(parent1.data>input1)
		  {
			  current=parent1.leftChild;
			  if(current==null)
			  {
				  parent1.leftChild=newNode;
				  break;
			  }
			  
		  }
		  else
		  {
			  current=parent1.rightChild;
			  if(current==null)
			  {
				  parent1.rightChild=newNode;
				  break;
			  }
			  
			  
		  }
			  
		  }
		  
		  
	  }
	}
	
	// Only inorder is sorted
	public void inorderTraversal(Node root)
	{
		if(root!=null)
	   {
		   inorderTraversal(root.leftChild);
		   System.out.println(root.data);
		   inorderTraversal(root.rightChild);	   
	   }		   
	}
	// Not sorter
	public void postOrderTraversal(Node root)
	{
		if(root!=null)
	   {
		   inorderTraversal(root.leftChild);
		   inorderTraversal(root.rightChild);	   
		   System.out.println(root.data);
			
	   }
		  	   
	}
	
	
	public static int maxDepth(Node root)
	{
		if(root==null)
			return -1;
		
		return 1+ Math.max(maxDepth(root.leftChild),maxDepth(root.rightChild));
		
	}
	
	public static int minDepth(Node root)
	{
		if(root==null)
			return 0;
		
		return 1+ Math.max(minDepth(root.leftChild),minDepth(root.rightChild));
		
	}
	
	public static boolean isBalanced(Node root)
	{
		int val=maxDepth(root)-minDepth(root);
		
		if(val<=1)
			return true;
		else
			return false;
	}
	// Not sorter
	public void preOrderTraversal(Node root)
	{
	   if(root!=null)
	   {System.out.println(root.data);
	   
		   preOrderTraversal(root.leftChild);
		   preOrderTraversal(root.rightChild);
	   }
	}
	
	
	
	public static void byLevel(Node root){
	     Queue<Node> level  = new LinkedList<>();
	     level.add(root);
	     while(!level.isEmpty()){
	         Node node = level.poll();
	         System.out.print(node.data + " ");
	         if(node.leftChild!= null)
	         level.add(node.leftChild);
	         if(node.rightChild!= null)
	         level.add(node.rightChild);
	     }
	}
	
	
	
	
	
	public void delete(int key)
	{
		Node current;
		boolean isLeft = false;
		if(root!=null)
		{
			//delete leaf
			
			current=root;
			parent=root;
			while(current.data!=key)
			{ parent=current;
			if(current.data>key)
			{
				isLeft=true;
				current=current.leftChild;
			}
			else
			{
				isLeft=false;
				current=current.rightChild;
			}
			
			}
			if(current.leftChild==null &&current.rightChild==null)
			{
				if(isLeft)
				{
					parent.leftChild=null;
				}
				else
				{
					parent.rightChild=null;
				}
			       return;
			}
			else if(current.leftChild==null)
			{
				if (parent == root)
			     root = parent.leftChild;
    	            else if (isLeft)					  
    	            parent.leftChild = parent.leftChild;
    	            else				               
    	            parent.rightChild = parent.leftChild;
					
			}
			else if(current.rightChild==null)
			{
				if (parent == root)
				     root = parent.rightChild;
	    	            else if (isLeft)					  
	    	            parent.leftChild = parent.rightChild;
	    	            else				               
	    	            parent.rightChild = parent.rightChild;
			}
			else
			{
				
			}
			
			
		}
		
	}
	
	
	private static void printRightBottomUp(Node root)  
	 {  
	  if(root==null)  
	   return;  
	    
	  // if leaf node, ignore while printing edges  
	  if(root.leftChild==null && root.rightChild==null)  
	  {  
	   return;  
	  }  
	  
	  if(root.rightChild!=null)  
	  {  
	   printRightBottomUp(root.rightChild);  
	  }  
	  else if(root.leftChild!=null)  
	  {  
	   printRightBottomUp(root.leftChild);  
	  }  
	  
	  System.out.print(root.data+" ");  
	 } 

	public void displayNode(Node root)
	{

		System.out.println(root.data);
		System.out.println(root.leftChild.data);

		System.out.println(root.rightChild.data);
		System.out.println(",");
		//System.out.println(ddata);
		System.out.println("}");
	}

	
	public Node Find(int key)
	{
		if(root.data==key)
			return root;
		else
		{Node current=root;
			while(current.data!=key)
			{
				if(current.data<key)
				{
					current=current.leftChild;
					
				}
				else
				{
					current=current.rightChild;
					
				}
				
			}
			return current;
		}
		
	}
}
class Node
{
int data;
double ddata;
Node leftChild;
Node rightChild;
	
}
