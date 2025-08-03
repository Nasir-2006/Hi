// import java.util.Scanner;
// public class Day7 {

//     public static void main(String arg[])
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter rows and Col:");
//         int row = sc.nextInt();sc.nextLine();
//         int col = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=row;i++)
//         {
//             for(int j = 1; j<=i ; j++)
//             {
//                 if(j%2==0)
//                 {
//                     System.out.print("1");
//                 }
//                 else
//                 {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//-------------------------------------------------------------------Simple Right Angle Triangle----------------------------------------------------------------------
// import java.util.Scanner;
// public class Day7{
//     public static void main(String atd[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("$");
//             }
//             System.out.println();
//         } 
//     }
// }
//-----------------------------------------------------------Hollow Right Angle Triangle------------------------------------------------------------------------------
// import java.util.Scanner;
// public class Day7{
//     public static void main(String atd[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int num = sc.nextInt();sc.nextLine();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if(i==1||i==num||j==1||j==i)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
                
//             }System.out.println();
//         }
//     }

// }
//-------------------------------------------Mirrored Right Angle Triangle--------------------------------------------------------------------------------
// import java.util.Scanner;
// public class Day7{
//     public static void main(String atd[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
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
//             }System.out.println();
//         }
//     }
// }