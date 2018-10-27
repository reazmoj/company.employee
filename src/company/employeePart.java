package company;
import java.util.Date;
import java.util.Scanner;

public class employeePart {
    public employeePart() {
        System.out.println("plese select your capacity from below list:\n");
        System.out.println("1)boss\n2)vicar\n3)employee");
        Scanner getCapicty = new Scanner(System.in);
        String Userinput  = getCapicty.nextLine();
        if (Userinput.equals("employee")){
            System.out.println("please enter your username and id....");

          /*  Scanner getUser = new Scanner(System.in);
            String UserInput = getUser.nextLine();
            System.out.println("Now enter your id:");
            Scanner
            Scanner getId = new Scanner(System.in);
            if (!"@".equals(getId))
            System.out.println("you are entered.");*/
            get_neme_id();
            System.out.println("Very good you entered in....");
            Date yourStart = new Date();
            System.out.println(yourStart);
            System.out.println("Now you can choose your desirable below list....\n");
            System.out.println("1)add member\n2)remove member\n3)get_vacation\n4)reserve");
            Scanner userInput = new Scanner(System.in);
            String UserInput = userInput.nextLine();
            if (UserInput.equals("reserve")) {
                System.out.println("you should go to self part...");
                Object employee = new self_partition();           }
            else {
                System.out.println("You can not go to here...");
            }
            Date yourExit = new Date();
            System.out.println(yourExit);
            System.out.println("Time that you were in this site is:");
        }
        else
            System.out.println("This part is security you cant entered.");

    }
    private void get_neme_id() {
        System.out.println("Notice!! you can try three time:");
        for (int i = 0 ; i < 3 ; i++) {
            Scanner name = new Scanner(System.in);
            String getus = name.nextLine();
            Scanner id = new Scanner(System.in);
            long getid = id.nextLong();
            if (getid < 99999 && getus.length() < 3)
                System.out.println("please try again...");
            else
                break;
        }
    }
}

