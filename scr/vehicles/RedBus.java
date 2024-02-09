// Concrete subclass of Bus.
// Provides a specific implementation for the engine() method for a RedBus.
// Inherits the implementation of the breaks() method from the Bus class.
class RedBus extends Bus {
    @Override
    public void engine(){
        System.out.println("RB engine capacity 40KMPH");
    }
}
