// Product
interface Transport {
    void deliver();
}

// Concrete Products
class Truck implements Transport {
    public void deliver() { System.out.println("Deliver by land"); }
}

class Ship implements Transport {
    public void deliver() { System.out.println("Deliver by sea"); }
}

// Creator
abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}

// Concrete Creators
class RoadLogistics extends Logistics {
    public Transport createTransport() { return new Truck(); }
}

class SeaLogistics extends Logistics {
    public Transport createTransport() { return new Ship(); }
}

// Client
public class Main {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();  // Output: Deliver by land

        logistics = new SeaLogistics();
        logistics.planDelivery();  // Output: Deliver by sea
    }
}
