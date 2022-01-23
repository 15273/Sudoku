package codewitemendi.Main;
/**
 * @version 18/01/2022
 * @author menachem mendel kalish
 * this program build sudoku square
 * */
public class Square3x3{
    private int[][] _tow = new int[3][3];

    public Square3x3() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                this._tow[i][j] = -1;
            }
        }
    }
    /**
     * @param array end use it to build the square*/
    public Square3x3(int[][] array){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i > array.length || j > array.length) {
                    array[i][j] = -1;
                } else
                    this._tow[i][j] = array[i][j];
            }
        }
    }
    /**
     * @param oter */
    public Square3x3(Square3x3 oter){
        oter = new Square3x3(oter._tow);
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i > oter._tow.length || j > oter._tow.length) {
                    oter._tow[i][j] = -1;
                } else
                    this._tow[i][j] = oter._tow[i][j];
            }
        }

    }

    public int[][] get_tow()
    {
        return _tow;
    }

    public int getCell(int row, int col) {
        if (row >= 3 || col >= 3) {
            System.out.println(-1 + " legal number for row/col are 0,1,2.");
        }
        return _tow[row][col];
    }

    public void setXY(int row, int col, int value) {
        _tow[row][col] = value;
    }

    public String toString(){
        return "Square3x3{" +"\n" + _tow[0][0] + '\t' + _tow[0][1] + '\t' + _tow[0][2] + '\n' +
                _tow[1][0] + '\t' + _tow[1][1] + '\t' + _tow[1][2] + '\n' +
                _tow[2][0] + '\t' + _tow[2][1] + '\t' + _tow[2][2] + '\n';
    }
    //chek if all the number in the square
    public boolean allThere(){
        boolean[] a = new boolean[10];
        int e = 0;
        for (int i = 0; i <= 2 && i >= 0; i++) {
            for (int j = 0; j <= 2 && j >= 0; j++) {
                e = _tow[i][j];
                if (e >= 0){
                   a[e] = true;}
            }
        }
        for (int i = 1; i < 10; i++) {
            if (!a[i])
            {
            return false;
            }
        }
        return true;
    }

   /**
    * @param row
    * @param values end chek the number in the row end enter
    * true to this value in the boolean */
   public void whosThereRow(int row, boolean[] values){
       int number=0;
           for(int i = 0;i <= 2;i++) {
               number = this._tow[row][i];
               if (number >= 0){
                   values[number] = true;
               }
           }
    }

    public void whosThereCol (int col, boolean []values ){
            for (int i=0;i<_tow.length;i++){
                int e=_tow[i][col];
                if (e >= 0){
                    values[e]=true;
                }
                }
    }
}
