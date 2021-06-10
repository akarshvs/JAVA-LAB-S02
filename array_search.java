import mypack.myutil;
public class array_search {
    public static void main(String[] args) {
        myutil io = new myutil();
        int s = io.i(io.in("ARRAY SIZE: "));
        int[] arr = new int[s];

        //input
        for(int i = 0; i < s; ++i)
            arr[i] = io.i(io.in(i + ": "));

        //search
        boolean flag = false;
        int el = io.i(io.in("ELEMENT TO SEARCH: "));
        for(int i = 0; i < s; ++i)
                if(el == arr[i])
                    flag = true;
        if(flag)
            io.out("ELEMENT FOUND!");
        else
            io.out("ELEMENT NOT FOUND!");
    }
}
