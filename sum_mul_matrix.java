import mypack.myutil;
public class sum_mul_matrix 
{
    public static void main(String args[])
    {
        matrix a = new matrix("A"); a.input();
        matrix b = new matrix("B"); b.input();
        //MATRIX ADDITION
        if(a.col != b.col && a.row != b.row)
            System.out.println("MATRIX ADDITION NOT POSSIBLE");
        else
            {
                matrix sum = new matrix("SUM");
                sum.mat = new int[sum.row = a.row][sum.col = a.col];
                for(int i = 0; i < sum.row; i++)
                    for(int j = 0; j < sum.col; j++)
                            sum.mat[i][j] = a.mat[i][j] + b.mat[i][j];
            
                sum.display();
            }
        //MATRIX MULTIPLICATION
        if(a.col != b.row)
            System.out.println("MATRIX MULTIPLICAION NOT POSSIBLE");
        else
            {
                matrix mul = new matrix("MUL");
                mul.mat = new int[mul.row = a.row][mul.col = b.col];
                for(int i = 0; i < a.row; i++)
                    for(int j = 0; j < b.col; j++)
                    {
                        mul.mat[i][j] = 0;
                        for(int k = 0; k < b.row; k++)
                            mul.mat[i][j] += a.mat[i][k] * b.mat[k][j];
                    }
                mul.display();
            }
    }
}

class matrix
{
    int row, col, mat[][];
    String name;
    myutil io = new myutil();
    matrix(String name)
    {
        this.name = name;
    }
    public void input()
    {
        io.out("MATRIX " + this.name);
        this.row = io.i(io.in("ROW COUNT: "));
        this.col = io.i(io.in("COLOUMN COUNT: "));
        this.mat =  new int[row][col];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                mat[i][j] = io.i(io.in("[" + i + "][" + j + "]: "));
    }
    public void display()
    {
        io.out("MATRIX " + this.name);
        for(int row[] : this.mat)
        {
            for(int col: row)
                System.out.print(col + "  ");
            io.out("");
        }
    }
}
