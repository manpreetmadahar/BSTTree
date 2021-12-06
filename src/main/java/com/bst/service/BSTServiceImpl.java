package com.bst.service;

import com.bst.model.BSTNode;

import java.util.LinkedList;
import java.util.Queue;

public class BSTServiceImpl implements BSTService {
    /**
     * This function will construct a binary tree out of the array passed as method parameter
     * and returns the deepest node and max depth of the binary tree.
     * @param nodeData
     * @return
     */
    @Override
    public String getDeepestNodeAndMaxDepth(int[] nodeData) {
        BSTNode rootNode = constructBinaryTreeFromArray(nodeData);
        String response = "deepest, "+getDeepestNodeOfBST(rootNode) +"; depth, " + getMaxDepthOfBST(rootNode);
        return response;
    }

    /**
     * This method will take the first node from the array as the root node and next elements within
     * the array are compared against the data of root node. if root node data > next node data then
     * the node is added to the left subtree otherwise its added on to the right subtree.
     * @param nodeData
     * @return
     */
    @Override
    public BSTNode constructBinaryTreeFromArray(int[] nodeData) {

        BSTNode rootNode =null;
        for (int data: nodeData){
             rootNode = insertNode (rootNode,data);
        }

        return rootNode;
    }

    /**
     * helper function to insert a node on left/right.
     * @param bstNode
     * @param data
     * @return
     */
    private BSTNode insertNode(BSTNode bstNode,int data) {
        if (bstNode==null)
            return new BSTNode(data);

        if (data > bstNode.getData())
                bstNode.setRightNode(insertNode(bstNode.getRightNode(),data));
        else if(data < bstNode.getData())
            bstNode.setLeftNode(insertNode(bstNode.getLeftNode(),data));
        return bstNode;
    }

    /**
     * This function will check the deepest node in the tree and returns its values. A queue is used to
     * check nodes at each level by inserting and removing until the last node is received.
     * @param rootNode
     * @return
     */
    @Override
    public int getDeepestNodeOfBST(BSTNode rootNode) {
        BSTNode tmpNode = null;
        if (rootNode == null)
            return -1;

        Queue<BSTNode> q = new LinkedList<>();
        q.offer(rootNode);

        // Iterates until queue become empty
        while (!q.isEmpty())
        {
            tmpNode = q.poll();
            if (tmpNode.getLeftNode() != null)
                q.offer(tmpNode.getLeftNode());
            if (tmpNode.getRightNode() != null)
                q.offer(tmpNode.getRightNode());
        }
        return tmpNode.getData();
    }

    /**
     * This function will get the max depth of binary tree.
     * @param rootNode
     * @return
     */
    @Override
    public int getMaxDepthOfBST(BSTNode rootNode) {
        if (rootNode==null)
            return -1;
        int depthOfLeftTree = getMaxDepthOfBST(rootNode.getLeftNode());
        int depthOfRightTree = getMaxDepthOfBST(rootNode.getRightNode());

        // 1 is added to include the height of root node.
        return Math.max(depthOfLeftTree,depthOfRightTree) +1 ;
    }

}
