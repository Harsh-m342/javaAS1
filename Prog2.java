/* AUTHOR:Harsh Mishra
Description: reads n elements in array and return position of largest number
*/
import java.util.Scanner;
public class Prog2 {
    public static int maxArray(int arr[],int size){
        int max=arr[0];
        int pos=0;
        for (int j=1; j<size;j++){
            if(arr[j]>max){
                max=arr[j];
                pos=j+1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        n=s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n ; i++){
            a[i]=s.nextInt();
        }
        System.out.println("The position of largest element in array is: "+ maxArray(a,n));

    }
    

}