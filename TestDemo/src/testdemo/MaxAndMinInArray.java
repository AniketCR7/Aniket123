
package testdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxAndMinInArray 
{
    public static void main(String[] args) 
    {
            // 1st method
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        
         int[] arr = new int[n];
        
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++)
        {
            
            arr[i]=sc.nextInt();
            
        }
        List<Integer> list=new ArrayList<>();
        
        for(int values : arr)
        {
            list.add(values);
        }
        
        Collections.sort(list);         
        System.out.println("Smallest number in Array is "+list.get(0));

        Collections.reverse(list);
        System.out.println("Largest number in Array is "+list.get(0));
        
       // 2nd method
        
//        int[] arr={2,4,8,2,98,6,887};
//        
//        int max=arr[0];
//        int min=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
//            if(arr[i]<min)
//            {
//                min=arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
                 
    }  
}
        
        

        

        
       
