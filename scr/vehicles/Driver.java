// Contains a method drive() that accepts a Vehicle object.
// Utilizes runtime polymorphism to invoke methods on different vehicle types without knowing their specific implementations.
class Driver {
    void drive(Vehicle v) {
        v.engine();
        v.breaks();
    }
}
