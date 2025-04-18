// Given a String with numbers and operators. Perform the operation on the numbers in their respective order. 
// Operator precedence need not be considered. The input string will have the numbers followed by the operators. 
// Input: "12345*+-+" 
// Result: 6 
 
// Input: "374291--*+-" 
// Result:-8 

public class Q5 {
    public static void main(String[] args) {
        String s = "374291--*+-";
        StringBuilder op = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if(c == '*' || c == '-' || c == '+' || c == '/')
            {
                op.append(c);
            }
            else{
                num.append(c);
            }
        }
        op.reverse();
        num.reverse();
        int operation = num.charAt(0)-'0';
        for(int i=0;i<num.length()-1;i++)
        {
            char c = op.charAt(i);
            int b = num.charAt(i+1) - '0';
            if(c == '+')
            {
                operation += b;
            } else if (c == '*') {
                operation *= b;
            } else if (c == '-') {
                operation -= b;
            }
            else {
                operation /= b;
            }
        }
        System.out.println(operation);
    }
}
