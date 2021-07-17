package Trees;

class Node{
    int item;
    Node l,r;
    Node(int data){
    item=data;
    l=r=null;
    }
}
public class CompleteBT {
    Node root;    
    
    public static void main(String[] args) {
        CompleteBT obj=new CompleteBT();
        obj.root=new Node(1);
        obj.root.l=new Node(2);
        obj.root.r=new Node(3);
        obj.root.l.l=new Node(4);
        obj.root.l.r=new Node(5);        
        //obj.root.r.r=new Node(6);        
        obj.root.r.l=new Node(6);        
        
        int nodeCount=nodeCount(obj.root);
        int index=0;
        if(isCompleteBT(obj.root,index,nodeCount))
            System.out.println("Yes Complete BT");
        else
            System.out.println("Not a Complete BT");                
    }
    private static boolean isCompleteBT(Node node, int index, int nodeCount){
        if(node==null)
            return true;
        if(index>=nodeCount)
            return false;
        return (isCompleteBT(node.l, 2*index+1, nodeCount) && isCompleteBT(node.r, index*2+2, nodeCount));                    
    }
    private static int nodeCount(Node root){
        if(root==null)
            return 0;
        else
            return(1+nodeCount(root.l)+nodeCount(root.r));
    }
    
}
