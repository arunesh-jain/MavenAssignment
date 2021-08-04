import java.util.*;

public class Application {
    public static void main(String[] args)
    {
        System.out.println("Enter a String to be Perform:");
        boolean run=true;
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        StringFunctions sf = new StringFunctions();
        while(run){
            System.out.println("\n\nPress the Respective Number for Task");
            System.out.println("\t 1.Reverse of String");
            System.out.println("\t 2.Length of String");
            System.out.println("\t Press any other number for Exit");
            int choice=scan.nextInt();
            switch (choice) {
                case 1: System.out.println("Reverse of String:  " + sf.reverseString(str));
                        break;
                case 2: System.out.println("Length of String:  Arunesh" + sf.lengthOfString(str));
                        break;
                default:run=false;
                        System.out.println("Program Exit");


            }
        }

    }
}
