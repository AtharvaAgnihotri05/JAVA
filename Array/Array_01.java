import java.util.Scanner;

public class Array_01
{
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6};
        // for(int i = 0;i < arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // // second method
        // for(int arrs : arr)
        // {
        //     System.out.println(arrs);
        // }


        // to find min number 
        // int arr1[] = {3,5,1,7,9,2};
        // int mini = Integer.MAX_VALUE;
        // for(int arr:arr1)
        // {
        //     if(arr < mini)
        //     {
        //         mini = arr;
        //     }
        // }
        // System.out.println(mini);


        // 2d array
        int arr[][] = new int [3][3];
        for(int i = 0 ; i < 3;i++)
        {
            for(int j = 0; j < 3;j++)
            {
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr.length);

    }
}