package com.gokul;

//GFG Link: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
/*Test-case
S = i.like.this.program.very.much
        Output: much.very.program.this.like.i*/

public class ReverseWords
{

    public static void main(String[] args)
    {
        String s[] = "i.like.this.program.very.much".
                split("\\.");
        String ans = "";
            
        for (int i = s.length - 1; i >= 0; i--)// condition to traverse string array in reverse order
        {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(ans.substring(0,
                ans.length() - 1));
    }
}
