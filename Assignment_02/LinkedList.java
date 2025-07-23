public class LinkedList {
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;
  Node tail;

  public void addFirst(int item) {
    Node newNode = new Node(item);
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void addLast(int item) {
    Node newNode = new Node(item);
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = null;
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void addMiddle(int item, int index) {
    Node node = new Node(item);
    Node temp = head;
    if (index == 0) {
      addFirst(item);
    } else {
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      node.next = temp.next;
      temp.next = node;
    }
  }

  public void removeLast() {
    Node tempSlow = head;
    Node tempFast = head.next;

    while (tempFast.next != null) {
      tempSlow = tempSlow.next;
      tempFast = tempFast.next;
    }

    tail = tempSlow;
    tail.next = null;
  }

  public void removeFirst() {
    head = head.next;
  }

  public void getKthNodeFromLast(int k) {
    Node tempSlow = head;
    Node tempFast = head;

    if (head == null) {
      throw new IllegalStateException();
    }

    for (int i = 0; i < k - 1; i++) {
      tempFast = tempFast.next;
      if (tempFast == null) {
        throw new IllegalArgumentException();
      }
    }

    System.out.println();
    while (tempFast.next != null) {
      tempSlow = tempSlow.next;
      tempFast = tempFast.next;
    }
    System.out.println("Kth Node from Last: " + tempSlow.data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node temp = head;
    while (temp != null) {
      sb.append(temp.data);
      if (temp.next != null) {
        sb.append(" -> ");
      }
      temp = temp.next;
    }
    return sb.toString();
  }

}
