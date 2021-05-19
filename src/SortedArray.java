import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1 ;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                System.out.println(arr[i]);

            }
        }

    }


}
