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



}
