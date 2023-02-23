package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class binaryTree{
		static int idx = -1;
		public static Node bulidTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = bulidTree(nodes);
			newNode.right = bulidTree(nodes);
			
			return newNode;
		}
	}
	//preorder traversal 
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	//inorder traversal
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	} 
	
	//postOrder traversal
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	//levelorder traversal
	public static void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currNode.data+" ");
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	//Countof Nodes
	public static int countOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		int leftNodes = countOfNodes(root.left);
		int rightNodes = countOfNodes(root.right);
		
		return leftNodes + rightNodes + 1;
	}
	
	//Sum fo Nodes
	public static int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		
		return leftSum + rightSum + root.data;
	}
	
	//Height of tree
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int myHeight = Math.max(leftHeight, rightHeight)+1;
		
		return myHeight;
		
	}
	
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binaryTree tree = new binaryTree();
		Node root = tree.bulidTree(nodes);
		//System.out.println(root.data);
		//preorder(root);
		//inorder(root);
		//postorder(root);
		//levelOrder(root);
		//System.out.println(countOfNodes(root));
		//System.out.println(sumOfNodes(root));
		System.out.println(height(root));

	}

}
