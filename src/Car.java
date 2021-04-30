import java.util.List;

public class Car {

    private int numStreets;
    private List streets;

    public Car(int numStreets, List streets) {
        this.numStreets = numStreets;
        this.streets = streets;
    }

    public int getNumStreets() {
        return numStreets;
    }

    public void setNumStreets(int numStreets) {
        this.numStreets = numStreets;
    }

    public List getStreets() {
        return streets;
    }

    public void setStreets(List streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numStreets=" + numStreets +
                ", streets=" + streets +
                '}';
    }
}
