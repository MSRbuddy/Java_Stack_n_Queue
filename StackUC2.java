public class StackUC2
{
    public static void main(String[] args) {

        Stack2 list = new Stack2();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println("Stack size is  " + list.size());
        System.out.println("Before pop ");
        list.display();
        while (list.size() != 0) {
            list.pop();
        }
        System.out.println("After pop ");
        list.display();
        System.out.println("<<<<<empty>>>>>");
    }
}

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }
}

class Stack2<T> {

    Node2 head;
    Node2 tail;

    public void display() {

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void push(int data) {

        Node2 newNode = new Node2(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() {
        head = head.next;
    }
    public Object pop(int data) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node2 temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;

        return head;
    }

    public int size() {

        Node2 temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    public Node2 search(int data) {

        Node2 temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        return null;
    }
}
