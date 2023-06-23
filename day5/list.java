class Node{
    int value;
    Node next;

    Node(int val){
        this.value=val;
        this.next=null;
    }
}


class list {
    static Node head;
    list(){
        head=null;
    }
    public Node insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return head;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
        return head;

    }

    public void show(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        
    }


    





    public static void main(String args[]){
        list l=new list();
        //Node node=new Node();
        head=l.insert(10);
        head=l.insert(20);
        head=l.insert(30);
        head=l.insert(40);
        l.show(head);
    }

}

