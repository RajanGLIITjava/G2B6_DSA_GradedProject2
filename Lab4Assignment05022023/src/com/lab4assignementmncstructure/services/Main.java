package com.lab4assignementmncstructure.services;

public class Main 
{
	Node node;
	Node prev = null;
	Node newHead = null;
	
	void BinarySearchTreeToSkewedTree(Node root)
	{
		if(root == null)
		return;       		 
		BinarySearchTreeToSkewedTree(root.left);
			Node rightNode = root.right;
			Node leftNode = root.left;
			
				if(newHead == null)			
				{
					newHead = root;
					root.left = null;
					prev = root;
				}
		else
		{										
		prev.right = root;				
		root.left = null;
		prev = root;
		}
		BinarySearchTreeToSkewedTree(rightNode);
	}
	
	
	void BinarySearchTraverseToSkwedTree(Node root)				
	{
		if(root == null)return;
		System.out.print(root.val + " ");
		BinarySearchTraverseToSkwedTree(root.right);
	}
}
