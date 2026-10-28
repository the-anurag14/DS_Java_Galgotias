class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        if (head == null)
            head = newNode;
        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }


    public void reverse() {
        Node curr = head, prev = null, next1;
        while (curr != null) {
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        head = prev;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.display();
        list.reverse();
System.out.println("");
        list.display();
    }
}
