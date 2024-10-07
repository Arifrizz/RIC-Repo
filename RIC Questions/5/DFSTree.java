import java.util.*;
class Node {
    int data;
    List<Node> children;
    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
    public void addChild(Node child) {
        this.children.add(child);
    }
}

public class DFSTree {

    public static void depthFirstSearch(Node root) {
        if (root == null) {
            return;
        }


        System.out.print(root.data + " ");


        for (Node child : root.children) {
            depthFirstSearch(child);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        Node child11 = new Node(5);
        Node child12 = new Node(6);
        child1.addChild(child11);
        child1.addChild(child12);

        Node child21 = new Node(7);
        child2.addChild(child21);

        System.out.println("Depth-First Search of the tree:");
        depthFirstSearch(root);
    }
}
