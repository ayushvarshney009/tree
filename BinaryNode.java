class BinaryNode <T> {
    T data;
    BinaryNode<T> left;
    BinaryNode<T> Right;

    public BinaryNode(T data) {

        this.data = data;
    }
}
    class Test {
        public static void main(String[] args) {
            BinaryNode <Integer>root = new BinaryNode<>(15);
            BinaryNode <Integer>Rleft = new BinaryNode<>(16);
            BinaryNode <Integer>Rright = new BinaryNode<>(20);
            root.left=Rleft;
            root.Right=Rright;
            Print(root);
        }
        public static void Print (BinaryNode root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            if(root.left != null) {
                Print(root.left);
            }
            if(root.Right != null) {
                Print(root.Right);
            }
        }
        }


