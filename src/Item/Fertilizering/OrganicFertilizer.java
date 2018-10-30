package Item.Fertilizering;

import Item.Fertilizering.Fertilizer;

/**
 * Factory(Factory Pattern)
 * @author XYN/HXP
 * @version 2018-10-29 23:10
 */

/**
 * 有机饲料
 */
public class OrganicFertilizer extends Fertilizer {
    /**
     * 设置有机饲料和加成
     */
    public String name;
    public int value;
    public void setName(String name) { this.name = name; }
    public void setValue(int value) { this.value = value; }

    public OrganicFertilizer(){
        setValue(100);
        setName("Organic Fertilizering");
    }
}
