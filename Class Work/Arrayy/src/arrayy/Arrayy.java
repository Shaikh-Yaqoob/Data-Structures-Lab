
package arrayy;

import java.util.Scanner;

/**
 *
 * @author Atif Malik
 */
public class Arrayy {

   
    public static void main(String[] args) {
      /*  int arr[]=new int[3];
        Scanner input=new Scanner(System.in);
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=input.nextInt();
        }
      
    
     char array[]={'a','b','c','d','e','f','g','h'};
     boolean exist=false;
     int a=0;
     Scanner input=new Scanner(System.in);
    char search=input.next().charAt(0);
    for(int i=0; i<array.length; i++)
    {
        if(array[i]==search)
        {
           a=i;
            exist=true;
           break;
        }
     
    }
 if(exist==true)
 {
     System.out.println("exist "+ a);
 }
 else{
     System.out.println("not exist");
 }
        another method of 1-D.......
        
        char arr[]={'a','b','c','d','e','f'};
        boolean bool=false;
        Scanner sc=new Scanner(System.in);
        char search=sc.next().charAt(0);
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {        System.out.println(search+ " index "+ i);
            bool=true;
            break;
        }
        }
        if(!bool)
        {
            System.out.println("Does not exist");
        }
   */
      
      boolean bool=false;
      int a=0,b=0;
      int arr[][]=new int[2][2];
      Scanner sc=new Scanner(System.in);
      for(int i=0; i<arr.length; i++)
      {
          for(int j=0; j<arr[i].length; j++)
          {
              arr[i][j]=sc.next().charAt(0);
          }
      }
        System.out.println("Search");
      char c=sc.next().charAt(0);
      for(int i=0; i<arr.length; i++)
      {
          for(int j=0; j<arr.length; j++)
          {
             if(arr[i][j]==c)
             {
                 bool=true;
                 a=i;
                 b=j;
             }
          }
      }
      
             if(bool==true)
             {
                 System.out.println("Exist");
             }
             if(bool!=true)
             {
                 System.out.println("not");
             }
      
    
    }
}
