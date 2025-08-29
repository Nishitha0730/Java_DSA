package Data_Structure;

public class myBinaryTree {
    public static void main(String[] args){
        System.out.println("Hello World ");
    }

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree{
        private Node root;

        public BinaryTree(){
            root = null;
        }

        public void insert(int data){
            root = insertRec(root, data);
        }

        public Node insertRec(Node current, int data){
            if(current == null){
                return new Node(data);
            }
            if(data < current.data){
                current.left = insertRec(current.left, data);
            }else{
                current.right = insertRec(current.right, data);
            }
            return current;
        }

        public void inOrder(){
            System.out.println("In-Oder :  ");
            inOrderRec(root);
            System.out.println();
        }

        public void inOrderRec(Node node){
            if(node != null){
                inOrderRec(node.left);
                System.out.print(node.data + " ");
                inOrderRec(node.right);
            }
        }
    }
}
