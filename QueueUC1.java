public class QueueUC1
{
    public static void main(String[] args) {

        Queue1 list = new Queue1();
        // here push performs enqueue operation
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        list.display();

    }
}

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
    }
}

class Queue1<T> {

    Node3 head;
    Node3 tail;

    public void display() {

        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void enqueue(int data) {

        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

}

