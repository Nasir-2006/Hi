import java.util.Scanner;
public class Day10 {
    static int sum(int num){
        if(num>0)
        {
           return num+sum(num-1);
        }
        else
        {
            return 0;
        }
    }
    
        public static void main(String atd[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();sc.nextLine();
        System.out.print(sum(num));
    }
    
    
    }

    

