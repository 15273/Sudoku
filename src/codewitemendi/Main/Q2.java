package codewitemendi.Main;

public class Q2 {
        String s1 = "";
        String s2 = " ";

public static String what (String s1, String s2){
        int[] c = new int [26];
        String res = s1;
        for (int i=0; i<s2.length(); i++)
        {
        int p = s2.charAt(i) - 'a';
        c[p]++; }

        int count = 0;
        for (int i=0; i<s1.length(); i++)
        {
        if (s1.charAt(i) >= 'a' && s1.charAt(i)<= 'z')
        {
        int p = s1.charAt(i) - 'a';
        if (c[p] != 0)
        res = res.substring(0, count) +
        res.substring(count+1);
             else
                count++;
        }
        else
            count++;
        }
         return res;
}
}

