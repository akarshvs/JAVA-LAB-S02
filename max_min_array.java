import mypack.myutil;
public class max_min_array 
{
    public static void main(String args[])
    {
        myutil io = new myutil();
        int n = 5; //size 
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = io.i(io.in("["+i + "]:"));
        int max, min; 
        max = min = arr[0];
        for(int i = 1; i < n; ++i)
        {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        io.out("MAX: " + max + " MIN: " + min);
    }   
}
