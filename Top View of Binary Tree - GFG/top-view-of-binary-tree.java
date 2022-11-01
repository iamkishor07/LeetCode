//{ Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class pair{
    int vertix;
    Node temp;
    pair(Node temp,int vertix){
        this.temp=temp;
        this.vertix=vertix;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Map<Integer,Integer>map=new TreeMap<>();
        Queue<pair> q=new LinkedList<>(); 
        q.offer(new pair(root,0)); 
        //inserts the first value root node with vertix 0
        while(!q.isEmpty()) {
        // runs untill the queue becomes empty
            pair p=q.poll();//pop the first Node from the queue
            Node currnode=p.temp;
            int v=p.vertix;
            if(!map.containsKey(v)){//checks if the map contains any value with the current vertix 
                map.put(v,currnode.data); //inserts if it's not contains any value with the vertix
            }
            if(currnode.left!=null){ //checks if it contains left side node
                q.offer(new pair(currnode.left,v-1)); // if contains then we insert it in to our queue with the vertix -- and the left node
            }
            if(currnode.right!=null){//checks if it contains right side node
                q.offer(new pair(currnode.right,v+1));//if contains we insert it into the queue data structure with the vertix++ and the right node
            }
        }
        // System.out.println(map);
        
        ArrayList<Integer> ans=new ArrayList<>(); 
        for(int i:map.keySet()){ ///now iterating through the map and inserting all the values accordingly the sorted order of the vertix's 
            ans.add(map.get(i));
        }
        return ans;
        //returing the arrylist
        // add your code
        
    }
}