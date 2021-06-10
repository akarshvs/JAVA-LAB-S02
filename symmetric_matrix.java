import mypack.myutil;
public class symmetric_matrix {
    int row, col, mat[][];
    String name;
    myutil io = new myutil();
    symmetric_matrix()
    {
        this.row = io.i(io.in("ROW COUNT: "));
        this.col = io.i(io.in("COLOUMN COUNT: "));
        this.mat =  new int[row][col];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                mat[i][j] = io.i(io.in("[" + i + "][" + j + "]: "));
    }
    public static void main(String args[])
    {
        symmetric_matrix m = new symmetric_matrix();
        boolean flag = true;
        for(int i = 0; i < m.row; ++i)
            for(int j = 0; j < m.col; ++j)
                if (m.mat[i][j] != m.mat[j][i])
                    flag = false;
        if (flag)
            System.out.println("SYMMETRIC");
        else
            System.out.println("NOT SYMMETRIC");

    }
}