public class StackUC1
{
    public static void main(String[] args) {
        Stack1 list = new Stack1();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
    }
}

class Node1 {

    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
    }
}

class Stack1<T> {

    Node1 head;
    Node1 tail;

    public void display() {

        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void push(int data) {

        Node1 newNode = new Node1(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }


    public Node1 search(int data) {

        Node1 temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        return null;
    }
}
