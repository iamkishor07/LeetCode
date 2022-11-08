//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String,List<String>>map=new HashMap<>(); //creating map with the string and arraylist
         for(int i=0;i<string_list.length;i++){
                char a[]=string_list[i].toCharArray();
                Arrays.sort(a);
                map.put(new String(a),new ArrayList<>()); // stores the sorted array and empty list at each string 
         }
        for(int i=0;i<string_list.length;i++){
            char a[]=string_list[i].toCharArray();
            Arrays.sort(a);
            map.get(new String(a)).add(string_list[i]); // mapping the current string to the its sorted string in an arraylist
        }
        List<List<String>> ans=new ArrayList<>(); //creating list of list String 
        for(String i:map.keySet()){
            ans.add(map.get(i)); //iterating through the map keys and adding it to the ans for every string in map
        }
        return ans;
    }
}
