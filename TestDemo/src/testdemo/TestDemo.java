
package testdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javafx.print.Collation;
import jdk.nashorn.internal.objects.NativeArray;

public class TestDemo 
{

    public static void main(String[] args) 
    
    {
       List a = new ArrayList();
      
       a.add("Aniket");
       a.add(8);
       a.add(9);      
       a.add(9);
       a.add(9);
       a.add("Nisha");
       a.add("Akash");
       a.add(9);
       a.add(9);
       a.add("Ronaldo");  
        a.add("Messi");
       a.add(8);
               
       // 1st Method
//        for (int j = 0; j < a.size(); j++) 
//        {
//        
//        for (int i=0;i<a.size();i++)
//      {
//          if(a.get(i).equals(9))
//          {
//            a.remove(i);
//          }
//      }
//          System.out.println("List "+a.get(j));  
//      }
    
        //2nd Method
        
       for (int i=a.size()-1;i>=0;i--)
      {          if(!a.get(i).equals(9))
          {
            System.out.println("List "+a.get(i));  
         }
               else
              {
                     a.remove(i);
                       }
      }
       
       
      
   }
}
  


  




