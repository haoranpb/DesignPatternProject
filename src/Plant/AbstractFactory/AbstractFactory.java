/**
 * Abstract Factory
 * interface AbstractFactory
 * @author TMY, QXC
 */

package Plant.AbstractFactory;

import Plant.Pasture;
import Plant.Corn;
import Plant.Rice;

public interface AbstractFactory {
    Rice getRice();
    Corn getCorn();
    Pasture getPasture();
}
