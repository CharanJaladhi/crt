import java.util.*;
public class hashmap {
    public static void main(String args[]){
    String s="Task:\r\n" + //
            "How do you reverse a single li9nked list without recursion?\r\n" + //
            "Hint:\r\n" + //
            "Iterate through the linked list,reversing\r\n" + //
            "the links between nodes,maintain three pointers;\r\n" + //
            "one for the current node,one for the previous node and one for next node.\r\n" + //
            "Update the links in each iteration until the end is reached.\r\n" + //
            "\r\n" + //
            "\r\n" + //
            "Task-2:\r\n" + //
            "How are duplicates are removed in unsorted linked list?\r\n" + //
            "\r\n" + //
            "Task-3:\r\n" + //
            "Scenario:\r\n" + //
            "Contact ManagementSystem:\r\n" + //
            "You are asked with implementing a Contact management system\r\n" + //
            "using as singly linkedlist.The contact management system allows user \r\n" + //
            "to store and manage their contacts, including adding new contacts,\r\n" + //
            "searching for contacts and displaying all contacts.\r\n" + //
            "REQUIREMENTS:\r\n" + //
            "1.Implement a class called \"Contact\" with the following properties;\r\n" + //
            "*'name': a string representing the phone number of the contact.\r\n" + //
            "*phoneNumber':a string representing the phone number of the contact.\r\n" + //
            "*'email':a string representing the email address of the contact.\r\n" + //
            "2.implement a class called \"ContactList\" that manages the contact\r\n" + //
            "list using single linked list.the \"contactList\" class should have\r\n" + //
            "the following methods.\r\n" + //
            "*addContact(Contact contact): Adds a new contact to the contact list.\r\n" + //
            "*searchContact(String name):Searches for a contact by name and returns\r\n" + //
            "the contact information if found.\r\n" + //
            "*displayContact():Displaying all the contacts in the contact list.";
            Hashtable<String,Integer> table=new Hashtable<>();
           
           
            String arr[]=s.split(" ");
           

            for(int i=0;i<arr.length;i++){
                String name=arr[i];
                if(!table.containsKey(name)){
                    table.put(name,1);
                }
                else{
                    int count=table.get(name)+1;
                    //table.remove(name);
                    table.put(name,count);
                 }
                
            }
            for(String key:table.keySet()){
                System.out.println("key: "+key+"\nValue: "+table.get(key));
            }
            
           
            
}
}
