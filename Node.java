/*
Addison Hoff
9/28/2020
10/4/2020
A Node class that takes 1 input data and 2 Nodes, 1 child Node and 1 parent node.
*/

public class Node <T> {

    private T t;
    private Node parent;
    private Node child;

    //Constructors
    public Node() {

    }

    public Node(T t) {
        this.t = t;
    }

    public Node(T t, Node parent, Node child) {
        this.t = t;
        this.parent = parent;
        this.child = child;
    }

    //Getters and setters
    public void setData(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }

    //Parent
    public void setParent(Node p) {
        this.parent = p;
    }

    public Node getParent() {
        return parent;
    }

    //Child
    public void setChild(Node c) {
        this.child = c;
    }

    public Node getChild() {
        return child;
    }

    public String toString() {
        return ("Node: " + t.toString());
    }

    public boolean equals(Node x) {
        return this.t.equals(x.t);
    }


}
