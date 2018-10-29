package Plant.State;

import Base.Plant;

public interface PlantState {
    String getStateName();
    void moveToNext(Plant p);
}
