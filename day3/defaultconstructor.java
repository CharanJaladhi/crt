import java.util.*;

class Car
{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public Car(){
	    doors="close";
	    engine="on";
	    driver="seated";
	    speed=10;
	}
	public String run(){
	    if(doors.equals("close")&&engine.equals("on")&&driver.equals("seated")&&speed>0)
	        return "Car is running";
	   else
	    return "CAr is not running";
	}
}




public class defaultconstructor{
    public static void main(String []args){
        Car obj=new Car();
        System.out.println(obj.run());
    }
}