package Plant.Flower;

import Plant.Mediator.PollinationMediator;

public class Stamen implements Flower {
    private FlowerState status;

    public String getType(){}
    public FlowerState getStatue(){}
    public void setStatus(FlowerState fs){}
    public void pollinate();
    public void pollinate(PollinationMediator pm){}
}
