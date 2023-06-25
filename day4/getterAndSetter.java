class Car{
     private String name;
     public void setName(String name){
        this.name=name;
     }
     public String getName(){
        return name;
     }
}


public class getterAndSetter{
    public static void main(String args[]){
        Car car=new Car();
        car.setName("BMW");
        System.out.println(car.getName());
    }
}