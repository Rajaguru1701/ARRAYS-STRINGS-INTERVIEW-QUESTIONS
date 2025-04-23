//First Non-Repeating Character in a String
//Given a string, find the first character that does not repeat.
//Example: Input: "swiss" Output: 'w' (since 's' repeats)

public class Q8 {
    public static void main(String[] args) {
        String s ="swiss";
        System.out.println(repeat(s));
    }
    static char repeat(String x)
    {
        for(int i=0;i<x.length();i++)
        {
            boolean flag = true;
            for(int j=i+1;j<x.length();j++)
            {
                if(x.charAt(i) == x.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                return x.charAt(i);
            }
        }
        return '\0';
    }
}
//optimal approach
// int[] freq = new int[26];
// for (int i = 0; i < x.length(); i++) {
//      freq[x.charAt(i)-'a']++;
// }
// for (int i = 0; i < x.length(); i++) {
//     if(freq[x.charAt(i)-'a'] == 1)
//     {
//         return x.charAt(i);
//     }
// }
// return '\0';
