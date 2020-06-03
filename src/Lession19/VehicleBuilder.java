package Lession19;

import java.util.List;

public class VehicleBuilder {
    private List<Wheel> wheels;
    private Body body;
    private Engine engine;

    public VehicleBuilder addWheels(List<Wheel> wheels) {
        this.wheels = wheels;
        return this;

    }

    public VehicleBuilder addBody(Body body) {
        this.body = body;
        return this;
    }

    public VehicleBuilder addEngine(Engine engine) {
        this.engine = engine;
        return this;

    }

    public Vehicle build() {
        Vehicle result = new Vehicle();
        result.setWheels(wheels);
        result.setEngine(engine);
        result.setBody(body);

        return result;
    }

}
