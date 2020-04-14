import java.util.Scanner;
class PrintArray {
    //To display array in sequential order.
    public static void printMyArray(int[] data, int index) {
        if (index != -1) {
            printMyArray(data,index - 1);
            System.out.println(data[index]);
        }
    }
     
    //To display array in reverse order.
    public static void printMyArrayReverse(int[] data, int index) {
        if (index != -1) {
            System.out.println(data[index]);
            printMyArrayReverse(data,index - 1);
        }
    }
     
    public static void main(String[] args) {
        int n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n=s.nextInt();
        int[] data=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            data[i]=s.nextInt();
        }
         
        //passing data array and last index to start.
        //To print sequential order
        System.out.println("Sequential Order");
        printMyArray(data,n - 1);
         
        //To print array in reverse order.
        System.out.println("Reverse Order");
        printMyArrayReverse(data,n - 1);
    }
}