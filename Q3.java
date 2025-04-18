
// Sort the indexes of the array as per the elements of the array: 
// Input Array: [4, 3, 2, 1] 
// Sorted indices: [3, 2, 1, 0] 

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        int[] copy = {4,3,2,1};
        Arrays.sort(copy);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] == copy[j])
                {
                    arr[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
