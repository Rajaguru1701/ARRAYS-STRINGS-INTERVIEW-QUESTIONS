public class PQ14 {
    public static void main(String[] args) {
        String s = "aabbrnn";
        int j = 0;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(j))
            {
                cnt++;
            }
            else {
                add(s,sb,j,cnt);
                cnt = 1;
                j = i;
            }
        }
        add(s,sb,j,cnt);
        System.out.println(sb.toString());
    }
    static void add(String s,StringBuilder sb,int j,int cnt)
    {
        if(cnt == 1){
            sb.append(s.charAt(j));
        }
        else {
            char n = (char)(cnt+'0');
            sb.append(n);
            sb.append(s.charAt(j));
        }
    }
}
