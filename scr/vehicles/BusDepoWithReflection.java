// Allows the user to input the name of a vehicle class at runtime.
// Utilizes the Reflection API to dynamically load and instantiate the specified class.
// Checks if the instantiated object is a Vehicle and then passes it to the drive() method of the Driver class for execution.
import java.util.Scanner;

class BusDepoWithReflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Driver hk = new Driver();
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Vehicle Name: ");
        String vehicleName = scn.next();

        try {
            Class cls = Class.forName(vehicleName);
            Object obj = cls.newInstance();

            if (obj instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) obj;
                hk.drive(vehicle);
            } else {
                System.out.println(vehicleName + " is not a vehicle");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
