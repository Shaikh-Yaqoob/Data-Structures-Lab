package arrayss;

import java.util.Arrays;

/**
 *
 * @author Atif Malik
 */
public class Arrayss {

    public static void reversArray(int []arr){
        for(int i=0; i<arr.length/2; i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array "+Arrays.toString(arr));
        reversArray(arr);
        System.out.println("After Reverse "+Arrays.toString(arr));
        
    }
    
}
