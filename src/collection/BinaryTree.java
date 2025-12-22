package collection;

public class BinaryTree{

    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        TreeNode<Character> f = new TreeNode<>('F');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.print("前序遍历:");
        preOrder(a);
        System.out.print("\n中序遍历:");
        inOrder(a);
        System.out.print("\n后序遍历:");
        postOrder(a);
        System.out.print("\n层序遍历:");
        levelOrder(a);
    }

    public static <T> void preOrder(TreeNode<T> root){
        if(root == null) return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static <T> void inOrder(TreeNode<T> root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.element + " ");
        inOrder(root.right);
    }

    public static <T> void postOrder(TreeNode<T> root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element + " ");
    }

    public static <T> void levelOrder(TreeNode<T> root){
        if(root == null) return;
        LinkedQueue<TreeNode<T>> queue = new LinkedQueue<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode<T> node = queue.poll();
            System.out.print(node.element + " ");
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
    }

    public static class TreeNode<E>{
        E element;
        TreeNode<E> left, right;

        public TreeNode(E element) {
            this.element = element;
        }
    }
}
