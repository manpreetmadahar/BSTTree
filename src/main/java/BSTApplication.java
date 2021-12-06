import com.bst.model.BSTNode;
import com.bst.service.BSTService;
import com.bst.service.BSTServiceImpl;

public class BSTApplication {
    public static void main(String args[]){
        int[] data ={12,11,90,82,7,9};
        BSTService service = new BSTServiceImpl();
       String result = service.getDeepestNodeAndMaxDepth(data);
       System.out.println(result);

    }
}
