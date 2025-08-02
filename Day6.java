// import java.util.Scanner;
// public class Day6 {
//     public static void main(String atd[])
//     {
//         System.out.print("Enter num:");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }

//     }
// }
// import java.util.Scanner;
// public class Day6{
//     public static void main(String atd[])
//     {
//         System.out.print("Enter rows:");
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();sc.nextLine();
//         System.out.print("Enter coulomns:");
//         int col = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=rows;i++)
//         {
//             for(int j=1;j<=col;j++)
//             {
//                 if(i==1||i==rows||j==1||j==col)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("\n");
//         }

//     }
// }
// import java.util.Scanner;
// public class Day6{
//     public static void main(String[] args) {
//         for(int i=1;i<=15;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if(i==1||i==15||j==1||j==i)
//                 {
//                     System.out.print("#");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
            
                
//             }System.out.print("\n");
//         }
//     }
// }
// import java.util.Scanner;
// public class Day6{
//     public static void main()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int num = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=num-i;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++)
//             {
//                 System.out.print("*");
//             }
//            System.out.println();
//         }
        
//     }
// }
// import java.util.Scanner;
// public class Day6
// {
//     public static void main(String atd[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows and col");
//         int row = sc.nextInt();sc.nextLine();
//         // int col = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=row;i++)
//         {
//             for(int j=row;j>=i;j--)
//             {
//                 if(i==1||i==row||j==row||j==i)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//     } 
// }
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= row; j++) {
                if (i == 1 || i == row || j == i || j == row) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
