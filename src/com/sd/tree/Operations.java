package com.sd.tree;

public class Operations {

    /**
     *  Finds the height/depth of the tree
     * @param root
     * @return
     */
    public int height(Node root) {
        if(root!=null) {
            if(root.left == null && root.right ==null) {
                return 0;
            }
            return maxDepth(height(root.left), height(root.right)) + 1;
        } else {
            return 0;
        }
    }

    static int maxDepth(int x, int y) {
        return (x>y)?x:y;
    }

    /**
     * Pre order traversal (Root -> Left -> Right)
     * @param root
     */
    public void preOrder(Node root) {
        if(root!=null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * Post order traversal (Left -> Right -> Root)
     * @param root
     */
    public void postOrder(Node root) {
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    /**
     * In order traversal (Left -> Root -> Right)
     * @param root
     */
    public void inOrder(Node root) {
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
