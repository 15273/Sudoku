package codewitemendi.Main;

public class RGBColor {
    int _red;
    int _green;
    int _blue;
    public RGBColor(){
        this._red = 0;
        this._green = 0;
        this._blue = 0;
    }
    public RGBColor(int red, int green, int blue){
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255){
        this._red = 0;
        this._green = 0;
        this._blue = 0;}

        else {
            this._red = red;
            this._green = green;
            this._blue = blue;
        }
    }

    public RGBColor(RGBColor other){
        other = new RGBColor(other._red, other._green, other._blue);
        this._red = other._red;
        this._green = other._green;
        this._blue = other._blue;
    }

    public int get_red() {
        return _red;
    }

    public void set_red(int _red) {
        this._red = _red;
    }

    public int get_green() {
        return _green;
    }

    public void set_green(int _green) {
        this._green = _green;
    }

    public int get_blue() {
        return _blue;
    }

    public void set_blue(int _blue) {
        this._blue = _blue;
    }

    @Override
    public String toString() {
        return "RGBColor{" +
                "_red=" + _red +
                ", _green=" + _green +
                ", _blue=" + _blue +
                '}';
    }

    boolean equals (RGBColor other){
        if (other._red != this._red || other._green != this._green || other._blue != this._blue){
            return false;}
        return true;
    }

    void mix (RGBColor other){
        int red = this._red / 2 + other._red / 2;
        int green = this._green / 2 + other._green / 2;
        int blue = this._blue / 2 + other._blue / 2;
        other = new RGBColor(red, green, blue);
    }

    double convertToGrayscale (){
        double Gray = (this._red * 30) / 100;
        double Gray1 = (this._green * 70) / 100;
        double Gray2 = (this._green * 10) / 100;
        int Gray3 = (int) (Gray + Gray1 + Gray2);
        return Gray3;
    }

    void invert(){
        int red = 255 -this._red;
        int green = 255 - this._green;
        int blue = 255 - this._blue;
        this._red = red;
        this._green = green;
        this._blue = blue;
    }
}
