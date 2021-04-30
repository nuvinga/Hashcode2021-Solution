public class SingleRun {

    private int intersectionStart;
    private int intersectionEnd;
    private String street;
    private int time;

    public SingleRun(int intersectionStart, int intersectionEnd, String street, int time) {
        this.intersectionStart = intersectionStart;
        this.intersectionEnd = intersectionEnd;
        this.street = street;
        this.time = time;
    }

    public int getIntersectionStart() {
        return intersectionStart;
    }

    public void setIntersectionStart(int intersectionStart) {
        this.intersectionStart = intersectionStart;
    }

    public int getIntersectionEnd() {
        return intersectionEnd;
    }

    public void setIntersectionEnd(int intersectionEnd) {
        this.intersectionEnd = intersectionEnd;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SingleRun{" +
                "intersectionStart=" + intersectionStart +
                ", intersectionEnd=" + intersectionEnd +
                ", street='" + street + '\'' +
                ", time=" + time +
                '}';
    }
}
