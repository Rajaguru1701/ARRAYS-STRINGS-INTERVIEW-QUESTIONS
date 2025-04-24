// Write a program to receive n numbers as input and a difference pair and to display
//  number of pairs with that difference
//  Input: 4 6 8 1 3 7 9
//  Difference: 2
//  Number of Pairs: 4
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {4,6,8,1,3,7,9};
        int dif = 2;
        int cnt = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1]) == dif)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
