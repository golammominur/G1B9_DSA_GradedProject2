package com.greatlearning.bsttoskewed;

import java.util.ArrayList;

public class DriverApp {
		  public static void main(String[] args) {
		        ArrayList<Integer> input = new ArrayList<>();
		        Node tree = new Node(50);
		        input.add(tree.data);
		        tree.left = new Node(30);
		        input.add(tree.left.data);
		        tree.right = new Node(60);
		        input.add(tree.right.data);
		        tree.left.left = new Node(10);
		        input.add(tree.left.left.data);
		        tree.right.left = new Node(55);
		        input.add(tree.right.left.data);
		        
		        System.out.println();
		        ArrayList<Integer> output = BSTS.traverse(tree);
		        System.out.print("Output ");
		        for (int i = 0; i < output.size(); i++) {
		            if (i == output.size() - 1) {
		                System.out.print(output.get(i));
		            } else {
		                System.out.print(output.get(i) + " ");
		            }
		        }

		  }

			
		

	}

