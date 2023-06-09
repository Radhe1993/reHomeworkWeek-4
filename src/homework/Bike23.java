package homework;
/**
 * Creating a child class
 */
public class Bike23 {
    //defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    } public static void main(String args[]) {
        Bike23 obj = new Bike23();//creating object
        obj.run();//calling method
    }
}
