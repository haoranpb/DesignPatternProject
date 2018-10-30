package Item.Fertilizering;

import Item.Fertilizering.Fertilizer;

/**
 * Factory(Factory Pattern)
 * @author XYN/HXP
 * @version 2018-10-29 22:10
 */

/**
 * 无机饲料
 */
public class InorganicFertilizer extends Fertilizer {
    /**
     * 设置名字和生长加成
     */
    public String name;
    public int value;
    public void setName(String name) { this.name = name; }
    public void setValue(int value) { this.value = value; }

    public InorganicFertilizer(){
        setValue(50);
        setName("Inorganic Fertilizer");
    }
}
