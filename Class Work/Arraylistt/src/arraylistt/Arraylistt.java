 
package arraylistt;

import java.util.ArrayList;

/**
 *
 * @author Atif Malik
 */
public class Arraylistt {

   
    public static void main(String[] args) {
  ArrayList obj=new ArrayList();
  obj.add(2);
  obj.add("Atif");
  obj.add(5.5);
  for(int i=0; i<obj.size(); i++)
        System.out.println(obj.get(i));
    }

    

   
    
}
