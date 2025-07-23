public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addFirst(50);
    list.addFirst(40);
    list.addFirst(30);
    list.addFirst(20);
    list.addFirst(10);

    System.out.println(list);

    // list.addMiddle(60, 2);
    // list.addLast(60);
    // list.removeLast();
    list.removeFirst();
    System.out.println(list);

    // Find the Kth Node from the last in a LinkedList
    // No size given.

    // list.getKthNodeFromLast(3);

  }
}
