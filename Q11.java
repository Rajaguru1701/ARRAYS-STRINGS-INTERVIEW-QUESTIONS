// Input: s = "Thisisdemostring", ch = 'i', count = 3
// Output: ng
// Explanation: The remaining substring of s after the 3rd
// occurrence of 'i' is "ng", hence the output is ng.
class Q11 {
    public static void main(String[] args) {
        String s = "thisisdemostring";
        int cnt = 3;
        char c = 'i';
        String res = isBe(s,cnt,c);
        System.out.println(res);
        
    }
    static String isBe(String s,int cnt,char c)
    {
        int Ccnt = 0; 
        int j = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
            {
                Ccnt++;
            }
            else if(Ccnt == cnt)
            {
                return s.substring(j,s.length());  
            }
            j++;
        }
        return "";
    }
}
