package codewitemendi.Main;

public class RGBImage {
    RGBColor [][] image;

    public RGBImage(int rows, int cols){
        image = new RGBColor[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.image[i][j] = new RGBColor();
            }
        }
    }
    public RGBImage(RGBColor[][] pixels){
        image = new RGBColor[pixels.length][pixels[0].length];
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                this.image[i][j] = new RGBColor(pixels[i][j]);
            }
        }
        }

    public int getHeight ( ){
        return this.image.length;
    }

    public int getWidth ( ){
        return this.image[0].length;
    }

    public RGBColor getPixel (int row, int col){
        if (this.image.length < row || this.image[0].length < col){
            RGBColor oter1 =new RGBColor();
            return  oter1 ;}
        return this.image[row][col];
    }

    public void setPixel (int row, int col, RGBColor pixel){
        if (this.image.length < row || this.image[0].length < col){

        }
        else
            this.image[row][col] = pixel;
    }

    public boolean equals (RGBImage other){
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (this.image[i][j] != other.image[i][j])
                    return false;
            }
        }
        return true;
    }
    public void flipHorizontal ( ){
        for(int i = 0; i < image.length / 2; i++) {
            for (int j = 0; j < image[0].length; j++) {
                this.image[i][j] = this.image[image.length - i][j];
            }
        }
    }
    public void flipVertical( ){
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length / 2; j++) {
                this.image[i][j] = this.image[i][image[0].length - j];
            }
        }
    }
    public void invertColors( ){
        for(int i = 0; i < image.length / 2; i++) {
            for (int j = 0; j < image[0].length; j++) {
                this.image[i][j].invert();
            }
        }
    }
    public double[][]toGrayscaleArray (){
        double toGrayscaleArray[][] = new double[image.length][image[0].length];
        for(int i = 0; i < image.length / 2; i++) {
            for (int j = 0; j < image[0].length; j++) {
                toGrayscaleArray[i][j] = this.image[i][j].convertToGrayscale();

            }
        }
        return toGrayscaleArray;
    }

    }


