public class Node <T> {

  private T t;
  private Node parent;
  private Node child;

  //Constructors
  public Node();

  public Node(data <t>) {
    this.t = t;
  }

  public Node(data <t>, Node parent, Node child) {
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

  public T getParent() {
    return p;
  }

  //Child
  public void setChild(Node c) {
    this.child = c;
  }

  public T getChild() {
    return child;
  }

  public String ToString() {
    return ("Node: " + t.toString());
  }

  public override boolean equals(Node x) {
    return this.t.equals(x.t);
  }


}
