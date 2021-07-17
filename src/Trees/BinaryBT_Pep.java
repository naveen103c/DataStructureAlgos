package Trees;

public class BinaryBT_Pep {
     Node root;
     static boolean isBal=true;
//O(n)
    public static void main(String args[]) {
        Height ht=new Height();
        BalancedBT obj = new BalancedBT();
        obj.root = new Node(1);
        obj.root.l = new Node(2);
        obj.root.r = new Node(3);
        obj.root.l.l = new Node(4);
        obj.root.l.r = new Node(5);
        obj.root.l.l.l = new Node(4);
        obj.root.l.l.l.r = new Node(4);

isBalanced(obj.root);
        System.out.println(isBal);
            
    }
    private static int isBalanced(Node node){
        if(node==null)
            return 0;
        int lh=isBalanced(node.l);
        int rh=isBalanced(node.r);
        int gap=Math.abs(lh-rh);
        if(gap>1)
            isBal=false;
        int th=Math.max(rh, rh)+1;
        return th;
    }
    
}
