package codewitemendi.Main;

import java.util.Scanner;
/**
 * @version 18/01/2022
 * @author menachem mendel kalish
 * this program build sudoku board
 * */
public class Sudoku {
    Square3x3[][]_tow=new Square3x3[3][3];
    public Sudoku(){
        Square3x3 e =new Square3x3();
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                e.setXY(i,j,-1);
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                _tow[i][j]=new Square3x3(e);
            }
        }
    }
    /**
     * @param square3x3Array end use it to build the board */
    public Sudoku(Square3x3[][] square3x3Array){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                this._tow[i][j] = new Square3x3(square3x3Array[i][j]);
            }
        }
    }
//use the function of the square 3x3 class to chek if the board ligal
public Boolean isValid() {

    boolean[] row2 = new boolean[10];
    boolean[] row = new boolean[10];
    boolean[] row3 = new boolean[10];
    //chek the rows in the board
    for (int i = 0; i <= 2; i++) {
            this._tow[i][0].whosThereRow(0, row);
            this._tow[i][1].whosThereRow(0, row);
            this._tow[i][2].whosThereRow(0, row);
            this._tow[i][0].whosThereRow(1, row2);
            this._tow[i][1].whosThereRow(1, row2);
            this._tow[i][2].whosThereRow(1, row2);
            this._tow[i][0].whosThereRow(2, row3);
            this._tow[i][1].whosThereRow(2, row3);
            this._tow[i][2].whosThereRow(2, row3);
            for (int rw = 1; rw < 10; rw++) {
                if (!row[rw] || !row2[rw] || !row3[rw]){
                    return false;
                }
                }
        }
    boolean[]colm2 = new boolean[10];
    boolean[]colm3 = new boolean[10];
    boolean[]colm1 = new boolean[10];
    //Checks the rows lengthwise
    for (int i = 0; i <= 2; i++) {
            this._tow[0][i].whosThereCol(0, colm1);
            this._tow[1][i].whosThereCol(0, colm1);
            this._tow[2][i].whosThereCol(0, colm1);
            this._tow[0][i].whosThereCol(1, colm2);
            this._tow[1][i].whosThereCol(1, colm2);
            this._tow[2][i].whosThereCol(1, colm2);
            this._tow[0][i].whosThereCol(2, colm3);
            this._tow[1][i].whosThereCol(2, colm3);
            this._tow[2][i].whosThereCol(2, colm3);
            for (int co = 1; co < 10; co++) {
                if (!colm1[co] || !colm2[co] || !colm3[co] ){
                    return false;
                }
                }
            }
    //Checking the squares
    for (int i = 0; i <= 2; i++){
        for (int j = 0; j <= 2; j++) {
            boolean a = this._tow[i][j].allThere();
            if (a != true){
                return false;
            }
        }
    }
    return true;
    }
    @Override
    //print the board
    public String toString() {
        return "Sudoku{"  +(_tow[0][0].toString() + "\t"+_tow[0][1].toString()+"\t"+_tow[0][2].toString()+"\n"
                +_tow[1][0].toString()+"\t"+_tow[1][1].toString()+"\t"+_tow[1][2].toString()+"\n"
                +_tow[2][0].toString()+"\t"+_tow[2][1].toString()+"\t"+_tow[2][2].toString());
    }
}
    /**

    Square3x3[][] square3x3Array=new Square3x3[3][3];
    Square3x3 e =new Square3x3();


                    this._tow=square3x3Array;
                    int[][][][] big_array =new int[][][][]{{this._tow[0][0].get_tow(),this._tow[0][1].get_tow(),this._tow[0][2].get_tow()},
                            {this._tow[1][0].get_tow(),this._tow[1][1].get_tow(),this._tow[1][2].get_tow()},
                            {this._tow[2][0].get_tow(),this._tow[2][1].get_tow(),this._tow[2][2].get_tow()}};

                     * for (int i = 0; i <= 2; i++) {
                     *                         for (int j = 0; j <= 2; j++) {
                     *                             for (int a = 0; a <= 2; a++) {
                     *                                 for (int b = 0; b <= 2; b++) {
                     *                                     int row_in_array = big_array[i][a][j][b];
                     *                                     all[c] = row_in_array;
                     *                                     row1.setXY(a, b, row_in_array);
                     *
                     *                                     System.out.println(all[c] + "," + row_in_array + "," + c);
                     *                                     c++;
                     *                                 }}
                     *                             if (c == 9) {
                     *                                 System.out.println(row1.toString());
                     *                                 row1.whosThereRow(0,row2);
                     *
                     *                                 for (int chek = 0; chek < 9; chek++) {
                     *
                     *                                     all_sudoku[e][chek] = all[chek];
                     *                                     System.out.print(all_sudoku[e][chek]);
                     *                                 }
                     *                             }
                     *                             e++;
                     *                             c = 0;
                     *                         }
                     *                     }
                     *                     return true;
                     *                 }
                     *                 {{square3x3Array[0][0].get_tow(),square3x3Array[0][1].get_tow(),square3x3Array[0][2].get_tow()},
                     {square3x3Array[0][0].get_tow(),square3x3Array[0][1].get_tow(),square3x3Array[0][2].get_tow()},
                     {square3x3Array[0][0].get_tow(),square3x3Array[0][1].get_tow(),square3x3Array[0][2].get_tow()}};**/
                    /**this._tow=square3x3Array;
                    boolean[][] row_chek = new boolean[10][10];
                    boolean[] colom_chek = new boolean[10];
                    int[][] ints = new int[9][9];


                    for (int i = 0; i <= 2; i++){
                        //for (int c=1;c < 10;c++){
                        //for (int d=0;d<9;d++){
                        for (int j = 0; j <= 2 ; j++){
                            for (int a = 0; a <= 2; a++){
                                square3x3Array[i][a].whosThereRow(j,colom_chek);
                                //for (int b = 0; b <= 2; b++){
                                //int row_in_array = big_array[i][a][j][b];
                                //int colom_in_array = big_array[j][i][b][a];
                                //ints[c-1][d]=row_in_array;
                                //System.out.println(ints[c-1][d]);
                                //colom_chek[colom_in_array]=true;
                                //row_chek[c][row_in_array]=true;
                                //Square3x3 ar =square3x3Array[i][b];
                                //System.out.println(ar);
                            }}
                    }
                    // }
                    // }
                    //}
                    /**for (int i=1;i < 10;i++){
                        for(int j=1;i<10;i++){

                            System.out.println(colom_chek[j]);
                            if (!row_chek[i][j] || !colom_chek[j]){
                                return false;

                            }
                        }
                    }**/



                    /** boolean b[]=new boolean[10];
                     boolean c[]=new boolean[10];

                     for (int i=0;i< _tow.length;i++){
                     for (int j=0;j< _tow[0].length;j++){
                     for (int e=1;e<10;e++){
                     _tow[i][j].whosThereCol(j,b);
                     _tow[i][j].whosThereRow(i,c);
                     if (b[e]==false )
                     {
                     System.out.println(false);
                     return false;
                     }
                     else if (c[e]==false )
                     {
                     System.out.println(false);
                     return false;
                     }
                     else if (_tow[i][j].allThere()==false)
                     {
                     return false;
                     }
                     }
                     }
                     }
                     return true;
                     private void Square3x3(){
                     int[][][][] big_array =new int[][][][]{{this._tow[0][0].get_tow(),this._tow[0][1].get_tow(),this._tow[0][2].get_tow()},
                     {this._tow[1][0].get_tow(),this._tow[1][1].get_tow(),this._tow[1][2].get_tow()},
                     {this._tow[2][0].get_tow(),this._tow[2][1].get_tow(),this._tow[2][2].get_tow()}};
                     int []all=new int[9];

                     for (int i = 0; i <= 2; ){
                     for (int c=0;c < 9;c++){
                     for (int j = 0; j <= 2 ; j++){
                     for (int a = 0; a <= 2; a++){
                     for (int b = 0; b <= 2; b++){
                     int row_in_array = big_array[i][a][j][b];
                     all[c++]=row_in_array;
                     System.out.println(c);
                     //int colom_in_array = big_array[j][i][b][a];
                     //System.out.println(ints[c-1][d]);
                     //colom_chek[colom_in_array]=true;
                     //row_chek[c][row_in_array]=true;
                     //Square3x3 ar =square3x3Array[i][b];
                     //System.out.println(ar);
                     }
                     }
                     }
                     }
                     }
                     }
                     {

                     for (int run_sud=0;run_sud<=2;run_sud++){

                     }
                     Square3x3 e=new Square3x3();
                     boolean chek[][]=new boolean[9][9];

                     for (int i = 0; i <= 2; i++) {
                     for (int j = 0; j <= 2; j++) {
                     for (int a = 0; a <= 2; a++) {
                     for (int b = 0; b <= 2; b++) {
                     square3x3Array[i][j] = e;
                     System.out.println("plese enter anumber of the sell " + i + 1 + "," + j + 1);
                     Scanner enter = new Scanner(System.in);
                     int enter_num = enter.nextInt();
                     e.setXY(a, b, enter_num);
                     if (enter_num <= 0) {
                     e.setXY(i, j, -1);
                     }
                     }
                     }
                     }
                     }

                     this._tow=square3x3Array;
                     }**/







