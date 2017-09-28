package com.example.java;

/**
 * Created by Christopher on 8/10/2017.
 */
public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }

    public void setData(int value){
        this.data = value;
    }

    public void setLeft(TreeNode node){
        this.left = node;
    }

    public void setRight(TreeNode node){
        this.right = node;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }


}
