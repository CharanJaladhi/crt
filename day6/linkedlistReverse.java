class Node{
    int value;
    Node next;
    Node(int val){
        this.value=val;
        this.next=null;
    }
}

public class linkedlistReverse{
    static Node head;
    linkedlistReverse(){
        this.head=null;
    }
    public Node create(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return head;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return head;
    }

    public void show(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value+" ");
            temp=temp.next;
        }
    }

    public Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node Next=head.next;
        while(prev.next!=null){
            current.next=prev;
            prev=current;
            current=Next;
            if(current==null)
            break;
            Next=current.next;
        }
        head = prev;
        return head;
    }




    public static void main(String [] args){
        linkedlistReverse list=new linkedlistReverse();
        head=list.create(10);
        head=list.create(20);
        head=list.create(30);
        head=list.create(40);
        head=list.create(50);
        //list.show(head);
        head = list.reverse(head);
        list.show(head);
    }






}
