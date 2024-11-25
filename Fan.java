class Fan{
    
    // constant attributes for fan's speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // private attributes
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    // no-arg constructor
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    // setter method for the speed
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    // setter method for the on     
    public void setOn(boolean on){
        this.on = on;
    }
    
    // setter method for the radius
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    // setter method for the color
    public void setColor(String color){
        this.color = color;
    }
    
    // getter method for the speed
    public int getSpeed(){
        return speed;
    }
    
    // getter method for the on
    public boolean getOn(){
        return on;
    }
    
    // getter method for the radius    
    public double getRadius(){
        return radius;
    }
    
    // getter method for the color
    public String getColor(){
        return color;
    }
    
    // toString method
    public String toString(){
        
        // display the speed, color, radius if the fan is on
        if(on){
            return "speed: "+speed+", color: "+color+", radius: "+radius;
        }
        else{
            return "color: "+color+", radius: "+radius+", fan is off";
        }
    }
    
}

// test program
public class Main
{
	public static void main(String[] args) {
		
		// create the first object of the Fan class
		Fan F1 = new Fan();
		F1.setSpeed(Fan.FAST);
		F1.setRadius(10);
		F1.setColor("yellow");
		F1.setOn(true);
		
		// create a second object of the Fan class
		Fan F2 = new Fan();
		F2.setSpeed(Fan.MEDIUM);
    
        System.out.println(F1);
        System.out.println(F2);
        
	}
}