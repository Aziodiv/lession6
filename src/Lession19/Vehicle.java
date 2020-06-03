package Lession19;

import java.util.List;

public class Vehicle {
    private List<Wheel> wheels;
    private Body body;
    private Engine engine;

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
