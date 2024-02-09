// Another concrete subclass of Bus.
// Overrides both the engine() and breaks() methods to provide specific implementations for a Volvo bus.
class Volvo extends Bus {
    @Override
    public void engine(){
        System.out.println("Volvo engine capacity 110 KMPH");
    }

    @Override
    public void breaks(){
        System.out.println("Volvo needs powerful breaks");
    }
}
