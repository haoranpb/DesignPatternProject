/**
 * abstract class reproductive organ
 * @author TMY, QXC
 */

package Plant.ReproductiveOrgan;

abstract public class ReproductiveOrgan {
    /**
     * the state of the organ
     */
    protected FlowerState state;

    /**
     * get the type of the organ
     * @return the type of the organ
     */
    abstract public String getType();

    /**
     * do pollination
     */
    abstract public void pollinate();

    /**
     * get the state of the organ
     * @return the state of the organ
     */
    abstract public FlowerState getState();

    /**
     * set the state of the organ
     * @param fs new state
     */
    abstract public void setState(FlowerState fs);
}
