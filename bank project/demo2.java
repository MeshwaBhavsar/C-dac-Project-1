import java.util.Scanner;


class ab {
    void getdata() {
        System.out.println("\n\n");
        System.out.println("                        ABHYUDHYA CO.OP.BANK             ");
        System.out.println("         22,23,24 INDRAPRATH,NEW RANIP,AHMEDABAD-382480        ");
        System.out.println("                     071-234567,071-4567838");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("=========================================================================================");
    }
}

class ac {
    final int bal = 1000;
    int amount, b, amt, w, am, t;
}

class deposite extends ac {
    public void dipo() {
        // System.out.println("\nenter amount for deposite");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        b = bal + amount;
        System.out.println("AFTER DIPOSITE YOUR BALANCE  : " + b);

    }

    public void with() {
        // System.out.println("\nenter amount for withdraw");
        Scanner sc = new Scanner(System.in);
        amt = sc.nextInt();
        if (b >= amt) {
            w = b - amt;
            System.out.println("SUCCESSFULLY WITHDRAW AMOUNT : " + w);
        } else {
            System.out.println("YOU CAN'T WITHDRAW");
        }

    }

    public void checkbalance() {
        System.out.println("\nYOUR BALANCE : " + w);
    }

    public void tr() {
        Scanner sc = new Scanner(System.in);
        am = sc.nextInt();
        if (w >= am) {
            t = w - am;
            System.out.println("\nTRANSATION IS SUCCESFUULY FOR AMOUNT =:" + am);
            System.out.println("\nAFTER TRANSATON  YOUR BALANCE : " + t);
        } else {
            System.out.println("TRANSATION IS NOT SUCCESS PLEASE TRY AGAIN !");
        }
    }
}
class Open
{
    public void newac()
    {
        String name, email, address, type;
        int bd, mono, sal,ch;
        System.out.println("\n----------------OPEN NEW ACCOUNT-----------");
        System.out.println("\n\nenter full name ");
        Scanner sc=new Scanner(System.in);
        name = sc.next();
        System.out.println("\nenter date of birth");
        bd = sc.nextInt();
        System.out.println("\nenter content number");
        mono = sc.nextInt();
        System.out.println("\nenter email address");
        email = sc.next();
        System.out.println("\n enter recidencial address");
        address = sc.next();
        System.out.println("\nenter account type");
        type = sc.next();
        System.out.println("enter montly salary");
        sal = sc.nextInt();
        System.out.println("\n\n.........................................");
        System.out.println("\n FULL NAME : " + name);
        System.out.println("DATE OF BIRTH : " + bd);
        System.out.println("CONTENT NUMBER : " + mono);
        System.out.println("EMAIL ADDRESS : " + email);
        System.out.println("ADDRESS : " + address);
        System.out.println("ACCOUNT TYPE : " + type);
        System.out.println("MONTHY SALARY : " + sal);
        System.out.println("\n................................................");
        System.out.println(
                "\n\nPlease Select Below Option For What Type Account You Can Open :-");

        System.out.println(
                "\n1.Saving Account\n2.Recuuring Account\n3.Current Account\n4.Minor-Saving Account");
        System.out.println("\nenter chocie");
        ch = sc.nextInt();
    }
}

public class demo2 {
    public static void main(String[] args) {
        deposite d = new deposite();
        ab a = new ab();
        a.getdata();
        int choice, ch1, ch, ch2, ch3;
        int balance;
        final int ac_no = 1234;
        int ac;
        System.out.println("\n1 LOGIN \n2.ALREADY LOGIN");
        System.out.println("\nEnter Choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        String username;
        int password;
        do {
            switch (choice) {
                case 1: {

                    System.out.println("\n-----------LOGIN------------");
                    System.out.println("\n\n Enter Username:-");
                    username = sc.next();
                    System.out.println("\nEnter Password:-");
                    password = sc.nextInt();
                    System.out.println("\n...........................");
                    System.out.println("\nUSERNAME = " + username);
                    System.out.println("PASSWORD = " + password);
                    System.out.println(".................................");
                    System.out.println("\n Your Login Is Sucessfully");
                    // choice = 0;
                    break;

                }
                case 2: {
                    System.out.println("\n-----------ALREADY LOGIN------------");
                    System.out.println("\n\nEnter Username:-");
                    username = sc.next();
                    System.out.println("\n Enter Password:-");
                    password = sc.nextInt();
                    System.out.println("\n\n Please Select Below Option :-");
                    System.out.println("\n1.OPEN NEW ACCOUNT\n2.FOR TRAN\n3.LOAN");
                    System.out.println("\n\n Enter Choice");
                      ch1 = sc.nextInt();
                      switch(ch)
                      {
                        case 1:
                        {
                            
                        }
                      }
                }
            }
        }
        while(choice!=3);

    }
}
    