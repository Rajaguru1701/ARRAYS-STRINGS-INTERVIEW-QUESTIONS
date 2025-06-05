String s = "AABBRNN";
int[] freq = new int[26];
for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i)-'A']++;
}
StringBuilder sb = new StringBuilder();
for (int i = 0; i < freq.length; i++) {
     if(freq[i] > 1)
     {
          char c = (char)('A'+ i);
          char n = (char)(freq[i]+'0');
          sb.append(n);
          sb.append(c);
     } else if (freq[i] == 1) {
           char c = (char)('A'+ i);
           sb.append(c);
     }
}
System.out.println(Arrays.toString(freq));
System.out.println(sb.toString());
