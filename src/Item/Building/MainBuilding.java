package Item.Building;


/**
 * Builder(Builder Pattern)
 * @author HXP/XYN
 * @version 2018-10-29 20:04
 */

public class MainBuilding {
    private double Length;
    private double Width;
    private double Height;

    private MainBuilding(Builder builder){
        this.Length=builder.Length;
        this.Width=builder.Width;
        this.Height=builder.Height;
    }
    public double getLength() {
        return Length;
    }
    public void setLength(double Length) {
        this.Length = Length;
    }
    public double getWidth() {
        return Width;
    }
    public void setWidth(double Width) {
        this.Width = Width;
    }
    public double getHeight() {
        return Height;
    }
    public void setHeight(double Height) {
        this.Height = Height;
    }

    static class Builder{
        private double Length;
        private double Width;
        private double Height;

        public void setLength(double Length) {
            this.Length=Length;
            //return this;
        }
        public void setWidth(double Width) {
            this.Width=Width;
            //return this;
        }
        public void setHeight(double Height) {
            this.Height=Height;
            //return this;
        }

        public MainBuilding construct(){
             return new MainBuilding(this);
        }
    }
}
