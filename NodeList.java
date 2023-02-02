public class NodeList{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head = null;
    public Node tail = null;

    public void insertfirst(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
        }
        else{
            head = newNode;
            head.next = temp;
        }
    }

    public void insertion_at_end(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail = newNode;
            tail.next = newNode;
        }

    }

    public void display() {
        Node current = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding a new node");
        while(current!=null){
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        NodeList newNode = new NodeList();
        newNode.insertfirst(10);
        newNode.insertfirst(20);
        newNode.insertfirst(30);
        newNode.insertfirst(40);

        newNode.insertion_at_end(50);
        newNode.display();
    }
}