public class QueueUC2
{
    public static void main(String[] args) {
        Queue2 list = new Queue2();
        list.enqueue(70);
        list.enqueue(30);
        list.enqueue(56);
        list.display();
        System.out.println("Queue size is " +list.size());
        while(list.size() != 0){
            list.dequeue();
        }
        list.display();
        System.out.println("\nThe Queue is empty....");

    }
}

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
    }
}

class Queue2<T> {
    Node4 head;
    Node4 tail;

    public void display() {

        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void enqueue(int data) {

        Node4 newNode = new Node4(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void dequeue() {
        head = head.next;
    }

    public Object dequeue(int data) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node4 temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;

        return head;
    }

    public int size() {

        Node4 temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

}