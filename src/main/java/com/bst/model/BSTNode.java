package com.bst.model;

public class BSTNode {
    private int data;
    private BSTNode leftNode;
    private BSTNode rightNode;

    public BSTNode(int data){
        this.data=data;
        this.leftNode=null;
        this.rightNode=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }

    public BSTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }
}
