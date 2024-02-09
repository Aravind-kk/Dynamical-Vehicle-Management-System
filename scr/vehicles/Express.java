// Yet another concrete subclass of Bus.
// Provides specific implementations for the engine() and breaks() methods for an Express bus.
class Express extends Bus {
    @Override
    public void engine(){
        System.out.println("Express engine capacity 80 KMPH");
    }

    @Override
    public void breaks(){
        System.out.println("Express needs Disk breaks");
    }
}
