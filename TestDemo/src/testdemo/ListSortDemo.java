package testdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo 
{
    public static void main(String[] args)
    {
       List list = new ArrayList();
       
       list.add("z");
        list.add("c");
        list.add("h");
        list.add("g");
        list.add("f");
        list.add("x");
        list.add("i");
        
       Collections.sort(list);

        for(Object s:list)
        {
            System.out.println(s);
          
       }  
        
        
        
        
   }
}

