public class Fruits {
private String aplle;
private String banana;
private  String orange;

    public Fruits(String aplle, String banana, String orange) {
        this.aplle = aplle;
        this.banana = banana;
        this.orange = orange;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "aplle=" + aplle +
                ", banana=" + banana +
                ", orange=" + orange +
                '}';
    }
}
