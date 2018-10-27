package company;
import  java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        System.out.println("welcome to our company....");
        System.out.print("lotfan ghesmate morede nazare khod ra");
        System.out.println(" az list zir entekhab konid:\n");
        String [] part = new String[] {"1)employee","2)depot","3)quality_control","4)self"};
        for (int i = 0 ; i < part.length ; i++){
            System.out.println(part[i]);
        }
        Scanner getPart = new Scanner(System.in);
        String Uterine  = getPart.nextLine();
        if (Uterine.equals("employee")) {
            System.out.println("you select employee....lets go");
            Object employee = new employeePart();
        }
        else if (Uterine.equals("self")) {
            System.out.println("you select self....lets go");
            Object employee = new self_partition();
        }
        else {
            System.out.println("Sorry This option is unavailable");
        }

    }

}