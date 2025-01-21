// public class loop{
//     public static void main(String[] args) {
//         // for loop
//         // for(int i = 0;i < 10;i++){
//         //     System.out.println(i);
//         // }
//         // while loop
//         int i = 0;
//         // while(i < 10)
//         // {
//         //     System.out.println(i);
//         //     i++;
//         // }
//         do
//         {
//             System.out.println(i);
//             i++;
//         }while(i < 5);
//     }
// }

// // break and continue statement
// // print only even number
// public class loop {
//     public static void main(String[] args) {
//         for(int i = 0 ; i < 11; i++)
//         {
//             if(i % 2 != 0)
//             {
//                 continue;
//             }
//             else
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }


// nested loop

// public class loop{
//     public static void main(String[] args) {
//         for(int i = 0; i < 10 ; i++)
//         {
//             System.out.println("This is "+i+" iteration");
//             for (int j = 0;j < 10 ;j++)
//             {
//                 if (i != j)
//                 {
//                     System.out.println(j);
//                 }
//             }
//         }
//     }
// }

// pattern
public class loop {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0;i < 5; i++)
        {
            for (int j = 0;j < i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}