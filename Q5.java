// Write a function that checks if two strings are anagrams of each other. An anagram is when the letters of one word can be rearranged to form another word.
// Example: Input: "listen", "silent" Output: True
// Input: "hello", "world" Output: False

public class Q6 {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
        System.out.println(isAnagram("hello","world"));;

    }
    public static boolean isAnagram(String s,String t)
    {
        int[] charS1 = new int[26];
        int[] charS2 = new int[26];

        if(s.length() != t.length())
        {
            return false;
        }
        else {
            for(int i=0;i<s.length();i++)
            {
                charS1[s.charAt(i)-'a']++;
                charS2[t.charAt(i)-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if(charS1[i] != charS2[i])
                {
                    return false;
                }
            }

        }
        return true;
    }
}
