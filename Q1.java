// 1.Given an array . Create two arrays one for Odd Elements and other for Even Elements. 
// Input: [10,3,5,12,17,22] 
// Output:  
// [10,12,22] 
// [3,5,7] 
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10,3,5,12,17,22,66,44,3};
        int oddcnt=0,evencnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 1)
            {
                oddcnt++;
            }
            else {
                evencnt++;
            }
        }
        int[] odd = new int[oddcnt];
        int[] even = new int[evencnt];
        int oddidx = 0,evenidx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 1)
            {
                odd[oddidx] = arr[i];
                oddidx++;
            }
            else {
                even[evenidx] = arr[i];
                evenidx++;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
    }
}
