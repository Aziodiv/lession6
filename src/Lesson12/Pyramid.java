package Lesson12;

public class Pyramid implements Figure {

    private double l;
    private double w;
    private double h;

    public Pyramid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Pyramid)) {
            return false;
        }
        Pyramid newObject = (Pyramid) object;


        if (newObject.getL() != l) {
            return false;
        }

        if (newObject.getH() != h) {
            return false;
        }

        if (newObject.getW() != w) {
            return false;
        }
        return true;

    }

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getVolume() {
        return (l * w * h) / 3;
    }

    @Override
    public double getArea() {
        return (l * w) + l * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2))
                + w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2));
    }
}
