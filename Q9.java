// Concatenate two input strings such that if the last character in the first string and first character in the second string are same, either of the one should be removed.
//  Input: string1: cat, string2: tree
//  Output: catree
//  Input: string1: Yamaha string2: RX
//  Output: YamahaRX


public class Q9 {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "tree";
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        if(s2.charAt(0) == s1.charAt(s1.length()-1))
        {
            flag = false;
        }
        if(!flag)
        {
            int n = s1.length()-1;
            for(int i=0;i<n;i++)
            {
                ans.append(s1.charAt(i));
            }
            for(int i=0;i<s2.length();i++)
            {
                ans.append(s2.charAt(i));
            }
        }
        else
        {
            for(int i=0;i<s1.length();i++)
            {
                ans.append(s1.charAt(i));
            }
            for(int i=0;i<s2.length();i++)
            {
                ans.append(s2.charAt(i));
            }
        }
        System.out.println(ans.toString());
    }
}
