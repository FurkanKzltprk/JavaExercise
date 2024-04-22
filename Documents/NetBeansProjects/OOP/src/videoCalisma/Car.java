
package videoCalisma;


public class Car {
    private int enginePower,model;
    public int speed;
    protected  String color;
    
    Car(){
        this.model = 2020;
        this.enginePower=300;
        this.speed = 250;
        this.color ="blue";
        
    }
    public void yaz (){
        System.out.println(model );
        
    }
    
}
