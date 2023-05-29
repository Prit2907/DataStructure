package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		
		isAnagram("hhe","hhe");
		
	}
	static boolean isAnagram(String a, String b)
    {
        // Complete the function
        
//        Map<Character,Integer> strmap=new HashMap<Character,Integer>();
//        Map<Character,Integer> strmap1=new HashMap<Character,Integer>();
//        char arr1[]=a.toCharArray();
//        char arr2[]=b.toCharArray();
//        
//        if(str)
		
		
	    char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();

        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length-1;i++)
            {
                int count1=0;
                int count2=0;
                char c=arr1[i];
                for(int j=0;j<arr1.length;j++)
                {
                    if(c==arr1[j])
                    {
                        count1++;
                    }
                }
                for(int k=0;k<arr2.length;k++)
                {
                    if(c==arr2[i])
                    {
                       count2++;
                    }  
                }
                if(count1!=count2)
                {
                    return false;
                }
                else
                {
                    continue;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
