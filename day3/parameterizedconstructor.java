import java.util.*;

class Car
{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public Car(String dor,String eng,String drive,int spd){
	    doors=dor;
	    engine=eng;
	    driver=drive;
	    speed=spd;
	}
	public String run(){
	    if(doors.equals("close")&&engine.equals("on")&&driver.equals("seated")&&speed>0)
	        return "Car is running";
	   else
	    return "CAr is not running";
	}
}


public class parameterizedconstructor{
    public static void main(String []args){
        Car obj=new Car("close","on","seated",100);
        System.out.println(obj.run());
    }
}