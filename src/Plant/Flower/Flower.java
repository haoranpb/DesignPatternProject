package Plant.Flower;

public interface Flower {
    String getType();
    void pollinate();
    void setStatus();
    FlowerState getState(FlowerState fs);
}
