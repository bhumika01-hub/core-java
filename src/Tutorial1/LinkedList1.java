package Tutorial1;

public class LinkedList1 {

    Node head;

    public void insert(int data){
        Node node = new Node(); // create new node
        node.data=data;   //it will goto "Node.java" class and then assign the value to it
        node.next=null;

        //this is for the 1st node, because the head is null and it will point to 1st node, if head is not null then goto else part
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n= n.next;
            }
            n.next= node;
        }

    }

    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data); //print data
            node=node.next; //shift data
        }
        System.out.println(node.data);
    }


    public void insertAtStart(int data){
        Node node = new Node(); // create new node
        node.data=data;   //it will goto "Node.java" class and then assign the value to it
        node.next=null;
        node.next=head; //here next element is the previous head node
        head =node; //head is the new node which you created now

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next; //new node gets previous address
            n.next = node;
        }
    }


    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }else{
            //traverse till index location
            Node n = head;
            Node n1=null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1: "+n1.data);//verify which data deleted
            n1=null;
        }
    }


}
