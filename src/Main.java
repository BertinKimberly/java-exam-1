import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        //object creation

        Car car=new Car("Red",130,50,400);

     //exception checking

        car.checkForException();

//        *************************SAVE AND READ OBJECT******************************

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            out.writeObject(car);
            System.out.println("Object called Car was saved to file");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        // Read object from the file using ObjectInputStream
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car newCar = (Car) in.readObject();

            //        *************************READING FROM THE FILE AND DISPLAYING TO THE CONSOLE******************************


            //get values
            newCar.getValues();

            //calling related methods

            newCar.watchTelevision();
            newCar.playRadio();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}