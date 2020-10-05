/*
Addison Hoff
9/28/2020
10/4/2020
A class to test the Node class created in Node.java.
*/

class main {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        Node n1 = new Node();
        Node n2 = new Node(B);
        Node n3 = new Node(B, n1, n2);
        Node n4 = new Node();

        //Check empty Node
        System.out.println("get Data of empty node: " + n1.getData());

        //Check getter and setters
        System.out.println("Check get data of nodes with data. Output should be null and 10.");
        System.out.println(n1.getData());
        System.out.println(n2.getData());

        System.out.println("Check set data of nodes with data. Output should be 4.");
        n2.setData(4);
        System.out.println(n2.getData());

        //Check .equals()
        System.out.println("Check .equals w/ different data. Output should be false.");
        System.out.println(n2.equals(n3));

        System.out.println("Check .equals w/ same data. Output should be true.");
        n2.setData(B);
        System.out.println(n2.equals(n3));



        //Check getParent, getChild
        System.out.println("Check getParent().");
        System.out.println(n3.getParent().getData());

        System.out.println("Check getChild().");
        System.out.println(n3.getChild().getData());

        //Check .toString()
        System.out.println("Check toString");
        System.out.println(n3.toString());







    }
}
