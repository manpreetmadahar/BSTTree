package com.bst;

import com.bst.service.BSTService;
import com.bst.service.BSTServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class BSTApplicationTest {
    @Test
    public void Test_getDeepestNodeAndMaxDepth(){
        int[] data ={12,11,90,82,7,9};

        BSTService service = new BSTServiceImpl();
        String result = service.getDeepestNodeAndMaxDepth(data);
        Assert.assertEquals("deepest, 9; depth, 3",result);
    }
}
