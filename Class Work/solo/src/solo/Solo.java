
package solo;

/**
 *
 * @author aa
 */
public class Solo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*  int arr[]=new int[3];
        for(int i=0; i<3; i++)
        {
            arr[i]=i;
        }
        int res=arr[0]+arr[2];
        System.out.println(res);
    }
    */
      int r=0;
      for(int i=0; i<5; i++)
      {
          if(i==3)
          {
              r+=10;
          }
          else{
              r+=i;
          }
      }
        System.out.println(r);
}
