// Given a list find all the leaders in the list, a number is said to be a leader if it is greater than all the elements to the right of it 
 
// Input: leaders([16,17,4,3,5,2]) 
// Output: 17,5,2 
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    flag = false;
                }
            }
            if(flag)
            {
                li.add(arr[i]);
            }
        }
        System.out.println(li);
    }
}
