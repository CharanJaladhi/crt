import java.util.Hashtable;

public class hashTable {
    public static void main(String args[]){
        //create a hah table
        Hashtable<String,Integer> table=new Hashtable<>();
        //Adding key/value pair to hash table
        table.put("Apple",10);
        table.put("Orange",90);
        //System.out.println(table.get("Apple"));
        //RETRIEVING DATA FROM HASH TABLE
        int count=table.get("Apple");
        System.out.println("count of apple is "+count);
        //REMOVING KEY/VALUE FROM HASH TABLE
        table.remove("Orange");
        //CHECKING WHETHER THE KEY PRESENT OR NOT
        boolean check=table.containsKey("Orange");
        System.out.println("Contains Orange or not:"+check);
        //ITERATE OVER KEY/VALUE PAIR IN THE HASHTABLE
        for(String key:table.keySet()){
            System.out.println("key: "+key+"\n"+"value: "+table.get(key));
        }
    }
}
