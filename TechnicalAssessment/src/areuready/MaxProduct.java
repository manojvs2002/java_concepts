package areuready;

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxProduct{
   
    static  int maxproduct(int a[]){
       int result=a[0];
       int n=a.length;
       for(int i=0;i<n;i++){
           int mul = a[i];
           
           for(int j=i+1;j<n;j++){
               result=Math.max(result,mul);
               mul =mul*result;
           }
           
           result=Math.max(result,mul);
       }    
       return result;
   }
   
   public static void main(String... args){
       Scanner in=new Scanner(System.in);
       System.out.println("enter the number of elements into arrays");
       int n=in.nextInt();
       
       int b[]=new int[n];
       
       for(int i=0;i<n;i++){
           b[i]=in.nextInt();
       }
       int res=maxproduct(b);
       System.out.println(res);
   }
    
}
