/*
Given a string s, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

Note:
s.length <= 100
33 <= s[i].ASCIIcode <= 122 
s doesn't contain \ or "
*/

class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        int i = 0, j = s.length() - 1;
        StringBuilder result = new StringBuilder(s);
        char temp;
        
        while (i < j)
        {
            while (!Character.isLetter(s.charAt(i)) && i < j)
            {
                i++;
            }
            
            while (!Character.isLetter(s.charAt(j)) && i < j)
            {
                j--;
            }
            
            temp = s.charAt(i);
            result.setCharAt(i, s.charAt(j));
            result.setCharAt(j, temp);
            
            i++;
            j--;
        }
        
        return result.toString();
    }
}
