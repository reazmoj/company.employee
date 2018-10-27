package company;

import java.util.Scanner;
class self_partition {
    public self_partition(){
        System.out.println("*******Welcome to self partition...*******\n");
        System.out.println("You can order your meal...\n");
        System.out.println("1)breakfast\n2)launch\n3)dinner");
        Scanner reader = new Scanner(System.in);
        String Reader = reader.nextLine();
        if ("breakfast".equals(Reader)){
            System.out.println("you selected breakfast");
        }
        else if ("launch".equals(Reader)){
            System.out.println("you you selected launch");
        }
        else if ("dinner".equals(Reader))
            System.out.println("you selected dinner");
        else
            System.out.println("your selection is not exist please try again...");
    }
}
