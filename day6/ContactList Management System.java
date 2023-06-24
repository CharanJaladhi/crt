import java.util.*;
class Contactlist{
    Contact contact;
    Contactlist next;
    Contactlist(Contact obj){
        this.contact = obj;
        this.next=null;
    }
}




class Contact{
    String name;
    int phoneNumber;
    String mail;
    Contact(String name,int phoneNumber,String mail){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.mail=mail;
    }

}

class Main{
    static Contactlist head;
    static Contact obj;
    Main(){
        this.head=null;
    }
    
    public  Contactlist addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print("Enter phone number:");
        int phoneNumber = sc.nextInt();
        System.out.print("Enter mail:");
        String mail = sc.next();
        Contact obj = new Contact(name,phoneNumber,mail);
        Contactlist contact=new Contactlist(obj);
        if(head==null){
            head=contact;
        }
        else{
            Contactlist temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=contact;
        }
        System.out.println("Successfully added");
        return head;

    }

    public void display(){
        Contactlist temp=head;
        while(temp!= null) {
            System.out.println("Name:"+temp.contact.name+"\n"+"PhNo:"+temp.contact.phoneNumber+"\n"+"Mail:"+temp.contact.mail);
            temp=temp.next;}

    }
    public void search(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the name that you want to search:");
        String s=in.nextLine();
        Contactlist temp=head;
        boolean flag=false;
        while(temp!=null){
            if(s.equals(temp.contact.name)){
                flag = true;
                System.out.println("Details: ");
                System.out.println(temp.contact.name + " " + 
                temp.contact.phoneNumber + " " + temp.contact.mail);

                break;
            }
            temp=temp.next;
        }
        if(flag==false){
             System.out.println("Name not found!");
        }
    }
        

    



public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    Main ob=new Main();
    while(true){
    System.out.println("Enter 1 to add contact\nEnter 2 to search contact\nEnter 3 to display details\nEnter 4 to exit");
    int condition=inp.nextInt();
    
    if(condition==1){
        head=ob.addContact();
        
    }else if (condition ==3){
        ob.display();
        
    }else if(condition==2){
        ob.search();
    }
    else if(condition==4){
        break;
    }
    }
}
}

