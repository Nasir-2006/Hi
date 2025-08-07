// import java.util.Scanner;
// public class Day11 {
//     static String reve(String st)
//     {
//         if(st.length()==0)
//         {
//            return "";
//         }
//         else
//         {
//             return reve(st.substring(1))+st.charAt(0);
//         }
        
//     }
//     public static void main(String[] args) {
//         String st;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter String:");
//         st = sc.nextLine();
//         System.out.println("You enetred "+reve(st));
//         sc.close();
//     }

// }
// import java.util.Scanner;
// public class Day11{
//     static void num(int n)
//     {
//        if(n>0)
//        {
//         num(n-1);
//         System.out.println(n);
//        }
//      }
//        public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();
//         System.out.println("You enetred "+n);
//         num(n);
//         sc.close();
//         }

// }