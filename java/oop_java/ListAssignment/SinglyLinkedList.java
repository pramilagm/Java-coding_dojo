

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;

    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public int remove() {
        if(this.head == null) {
            System.out.println("SLL is empty!");
            return 0;
        } 
        else if(this.head.next == null){
            int val = head.value;
            head = null;
            return val;}
        else {
            Node runner = this.head;
            while(runner.next.next != null) {
                runner = runner.next;
            }
            int val = runner.next.value;
            runner.next = null;
            return val;
        }
    }
    public Node find(int val){
       
        Node runner = this.head;
       while(runner!=null){
            if(runner.value==val){
                return runner;
            }
            else{
            runner = runner.next;
            }
        }
        Node noNode = new Node(0);
        return noNode;
            
        
    }

    public void printValues(){
        Node runner = this.head;
        while(runner!=null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}