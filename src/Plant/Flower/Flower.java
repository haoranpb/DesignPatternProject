package Plant.Flower;

public interface Flower {
    String getType();
    void pollinate();
    FlowerState getState();
    void setState(FlowerState fs);
}
