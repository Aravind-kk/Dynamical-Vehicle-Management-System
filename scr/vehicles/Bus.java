// Abstract class representing a generic bus.
// Implements the Vehicle interface but only provides a concrete implementation for the breaks() method.
// Leaves the engine() method abstract, as its implementation varies for different types of buses.
abstract class Bus implements Vehicle {
    @Override
    public void breaks(){
        System.out.println("Bus has normal breaks");
    }
}
