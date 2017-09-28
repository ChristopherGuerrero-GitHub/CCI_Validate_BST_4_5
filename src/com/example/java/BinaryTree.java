package com.example.java;

/**
 * Created by Christopher on 8/10/2017.
 */
public class BinaryTree extends TreeNode {

    private static TreeNode root;

    public BinaryTree(int value){
        setData(value);
    }

    public void addNode(TreeNode parent, TreeNode child, String orientation){

        if (orientation.equals("left")){
            parent.setLeft(child);
        }
        else {
            parent.setRight(child);
        }
    }




}
