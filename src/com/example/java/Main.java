package com.example.java;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 4.5 Validate Binary Search Tree.
            A TreeNode chain is created and pass to a checkBST method that will pass the Tree node
            to a overloaded method checkBST that will accept a TreeNode and integer min value and
            integer max value as parameters. The overload checkBST method will be invoked recursively
            as each node is checked to see if it is balanced with the parent node being greater than the
            child node on the left and less than the child node to the right of the parent node.

         */

        //Defining and creating TreeNodes objects
        TreeNode node_1 = new TreeNode(2);
        TreeNode node_2 = new TreeNode(4);
        TreeNode node_3 = new TreeNode(7);
        TreeNode node_4 = new TreeNode(5);
        TreeNode node_5 = new TreeNode(13);

        //Connecting the TreeNode objects in a chain
        BinaryTree myTree = new BinaryTree(3);

        //               3
        //              / \
        //             2   4
        //                / \
        //                   7
        //                  / \
        //                 5   13

        myTree.addNode(myTree,node_1,"left");
        myTree.addNode(myTree,node_2,"right");
        myTree.addNode(node_2,node_3,"right");
        myTree.addNode(node_3,node_4,"left");
        myTree.addNode(node_3,node_5,"right");

        boolean result = checkBST(myTree);
        System.out.println("Is the Binary tree a Binary Search Tree? : " + result);


    }


    static public boolean checkBST(TreeNode root){
        return checkBST(root, null, null);
    }

    /*
        The overload checkBST method will be invoked recursively as each node is checked to see
        if it is balanced with the parent node being greater than the child node on the left and
        less than the child node to the right of the parent node.
     */
    static public boolean checkBST(TreeNode n, Integer min, Integer max){

        if (n == null) return true;

        if ((min != null && n.data <= min) || (max != null && n.data > max) ){
            return false;
        }

        if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)){
            return false;
        }

        return true;


    }

}
