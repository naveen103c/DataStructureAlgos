package Trees;

class Height {
    int height = 0;
}

public class BalancedBTT {

    Node root;
//O(n)
    public static void main(String args[]) {
        Height ht=new Height();
        BalancedBT obj = new BalancedBT();
        obj.root = new Node(1);
        obj.root.l = new Node(2);
        obj.root.r = new Node(3);
        obj.root.l.l = new Node(4);
        obj.root.l.r = new Node(5);

        //if(isBalancedBT(obj.root,ht.height))
        if (isBalancedBTT(obj.root,ht)) {
            System.out.print("Yes Balanced BT");
        } else {
            System.out.print("Yes Balanced BT");
        }
    }
    private static boolean isBalancedBTT(Node node,Height ht) {
        if(node==null){
            ht.height=0;
            return true;
        }
        Height lh=new Height(),rh=new Height();
        boolean l=isBalancedBTT(node.l,lh);
        boolean r=isBalancedBTT(node.r,rh);
        
        int left_h=lh.height,right_h=rh.height;
        ht.height=(left_h>right_h?left_h:right_h)+1;
        if(Math.abs(left_h-right_h)>=2)
            return false;
        else
            return l && r;       
    }

}
