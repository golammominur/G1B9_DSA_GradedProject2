package com.greatlearning.bsttoskewed;

	import java.util.ArrayList;

	public class BSTS {
	    public static ArrayList<Integer> traverse(Node tree) {
	        ArrayList<Integer> result = new ArrayList<>();
	        traverseHelper(tree, result);
	        return result;
	    }

	    private static void traverseHelper(Node tree, ArrayList<Integer> result) {
	        if (tree == null) {
	            return;
	        }

	        traverseHelper(tree.left, result);
	        result.add(tree.data);
	        traverseHelper(tree.right, result);
	    }

		
	}


