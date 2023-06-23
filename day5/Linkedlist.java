import java.util.*;
class Linkedlist{
    public String findmiddle(LinkedList<String> list){
         return list.get(list.size()/2);
    }


    public String findlast(LinkedList<String> list){
        return list.get(list.size()-1);
    }


    public static void main(String []args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("ajju");
        list.add("charan");
        list.add("shannu");
        list.add("krishna");
        list.add("sriram");
        list.add(4,"madhu"); 
         System.out.println("The list contains:"+list);
        Linkedlist l=new Linkedlist();
        System.out.println("The second middle element is:"+l.findmiddle(list)); 
        System.out.println("The last element is:"+l.findlast(list)); 
}
}
