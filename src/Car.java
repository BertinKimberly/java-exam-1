import java.io.Serializable;

public class Car implements RadioTv, Serializable {
    String color;
    int numberOfSeats;
    int minH;
    int maxH;

    //constructors

    public Car(String color,int numberOfSeats,int minH,int maxH){
        this.color=color;
        this.numberOfSeats=numberOfSeats;
        this.minH=minH;
        this.maxH=maxH;
    }
    public Car(int minH,int maxH){
        this.minH=minH;
        this.maxH=maxH;
    }
    Car(){

    }
    public void getValues(){
        System.out.println("here are the properties of a car : ");
        System.out.println(color);
        System.out.println(numberOfSeats);
        System.out.println(minH);
        System.out.println(maxH);
    }
    @Override
    public void watchTelevision() {
        System.out.println("what a sensational movie ");
    }

    @Override
    public void playRadio() {
       System.out.println("playing music");
    }


    //try catch
   public void checkForException() {
       try {
           if (numberOfSeats > 100) throw new SeatNumberException("The number of seats is beyond 100");
       } catch (SeatNumberException e) {
           System.out.println(e.getMessage());
           //terminate the program
           System.exit(0);
       }
   }

}
