package com.bst.service;

import com.bst.model.BSTNode;

public interface BSTService {

    public int getDeepestNodeOfBST(BSTNode rootNode);
    public int getMaxDepthOfBST(BSTNode rootNode);
    public String getDeepestNodeAndMaxDepth(int []nodeData);
    public BSTNode constructBinaryTreeFromArray(int []nodeData);

}
