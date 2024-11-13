import java.util.Scanner;

class ac {
    void getdata() {
        System.out.println("\n\n");
        System.out.println("                        ABCD CO.OP.BANK             ");
        System.out.println("         22,23,24 INDRAPRATH NEW RANIP,AHMEDABAD-382480        ");
        System.out.println("                     071-234567,071-4567838");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("=========================================================================================");
    }
}

class my {
    final int ac_no = 1234;
    int ac;
    int date;
    String name;

    public void mydata() {
        System.out.println("\n\nenter name:");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("enter ac_no");
        ac = sc.nextInt();
        if (ac == ac_no) {
            System.out.println("\nplease enter amount for deposite");
        } else {
            System.out.println("plase try again");
        }
        System.out.println("enter date for deposite");
        date = sc.nextInt();
        System.out.println("================================================");
        System.out.println("your name is=" + name);
        // System.out.println("your ac_no is=" + ac_no);
        System.out.println("date for withrew or depisite=" + date);
    }
}

class amo {
    static int amount = 1000, total, to, balance, i;
}

class deposite extends amo {
    // static int amount = 1000, total;
    int amt;

    public void depo() {
        // System.out.println("\n\nenter amount you want to enter");
        Scanner sc = new Scanner(System.in);
        amt = sc.nextInt();
        total = amt + amount;

        System.out.println("\nyour amount is=" + total);
    }

}

class withdrwa extends amo {
    int am, to;

    public void with() {
        System.out.println("\nenter amount you want to withdrwraw");
        Scanner sc = new Scanner(System.in);
        am = sc.nextInt();
        if (total >= am) {
            to = total - am;
            System.out.println("\nafter withdrwa your amount is=" + to);
        } else {
            System.out.println("\nplease try again");
        }

    }
}

class checkblance extends withdrwa {
    public void display() {
        System.out.println("your balance is=" + to);
    }
}

/*
 * class tran extends withdrwa {
 * int t, a;
 * 
 * public void tra() {
 * System.out.println("\nenter amount for transation");
 * Scanner sc = new Scanner(System.in);
 * a = sc.nextInt();
 * if (to >= a) {
 * t = to - a;
 * System.out.println("transtion is = " + t + "rupees");
 * } else {
 * System.out.println("not avalible balance in your account");
 * }
 * }
 * }
 */

class bank {
    public static void main(String[] args) {
        ac b = new ac();
        b.getdata();
        my m = new my();
        // m.mydata();
        deposite d = new deposite();
        // withdrwa w = new withdrwa();
        checkblance c = new checkblance();
        // tran t = new tran();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.create new account\n2.already account is here \n3.for loan");
        System.out.println("\nplease enter choice");
        choice = sc.nextInt();
        do {
            switch (choice) {
                case 1: {
                    System.out.println("------------create new account------------");
                    int ch1;
                    System.out.println(
                            "\n1.saving account\n2.current account\n3.recuring account\n4.minor-saving account");
                    System.out.println("\n please enter chocie");
                    ch1 = sc.nextInt();
                    switch (ch1) {

                        case 1: {

                            System.out.println("\n                SAVING ACCOUNT               ");
                            System.out.println("===============================================");

                            System.out.println(
                                    "ABOUT THIS AC:-  In this ac you will get 2 or 4% intrest for your deposite amount");
                            System.out.println("for open this ac you will follow below notes and submit for bank ");
                            System.out.println("please atech this papers:-");
                            System.out.println(
                                    "\n* fill the ac open form \n* pancard copy \n* adharcard copy \n* pasportsize photos(2)");

                            System.out.println("\n your account no is :- A124567859");

                            System.out.println("\n\n..............................");
                            System.out.println("              THANK YOU           ");
                            System.out.println("..................................");
                            break;
                        }
                        case 2: {
                            System.out.println("\n\n            CURRENT ACCOUNT                ");
                            System.out.println("===============================================");

                            System.out.println("ABOUT THIS AC:-  This account is open for bussinece."
                                    + "        in this account you will also give 2 or 4% intrest");
                            System.out.println("for open this ac you will follow below notes and submit for bank");
                            System.out.println("please atech this papers:-");
                            System.out.println(
                                    "\n* fill the ac open form \n* pancard copy \n* adharcard copy \n* pasportsize photos(2) \n* bussinec pruf");

                            System.out.println("\n your account no is :- A124567859");

                            System.out.println("\n\n..............................");
                            System.out.println("            THANK YOU             ");
                            System.out.println("..................................");
                            break;
                        }
                        case 3: {
                            System.out.println("\n\n              RECURING ACCOUNT              ");
                            System.out.println("===============================================");

                            System.out.println("ABOUT THIS AC:-   In this account we will put monthly deposites");
                            System.out.println(
                                    "\n* fill the ac open form \n* pancard copy \n* adharcard copy \n* pasportsize photos(2)");
                            System.out.println("for open this ac you will follow below notes and submit for bank");
                            System.out.println("please atech this papers:-");
                            System.out.println(
                                    "\n* fill the ac open form \n* pancard copy \n* adharcard copy \n* pasportsize photos(2)");

                            System.out.println("\n your account no is :- A124567859");

                            System.out.println("\n.................................");
                            System.out.println("             THANK YOU             ");
                            System.out.println("....................................");

                            break;
                        }
                        case 4: {
                            System.out.println("\n\n              MINOR-SAVINGES ACCOUNT             ");
                            System.out.println("=======================================================");

                            System.out.println(
                                    "ABOUT THIS AC:-  this account is open only for children whom age is between 5 to 18");
                            System.out.println("for open this ac you will follow below notes and submit for bank");
                            System.out.println("please atech this papers:-");
                            System.out.println(
                                    "\n* fill the ac open form \n* pancard copy \n* adharcard copy \n* pasportsize photos(2)");

                            System.out.println("\n your account number is :- A124567859");

                            System.out.println("\n\n............................");
                            System.out.println("           THANK YOU            ");
                            System.out.println("................................");
                            break;
                        }
                        default: {
                            System.out.println("inavalid chocie");
                            break;
                        }
                    }
                    // break;
                }
                    break;
                case 2: {
                    System.out.println("\n-------------alreday account is here---------------");
                    System.out.println("\n1.diposite\n2.withdraw\n3.checkbalance\n4.transation");
                    int ch2;
                    System.out.println("\n select chocie");
                    ch2 = sc.nextInt();
                    switch (ch2) {
                        case 1: {
                            System.out.println("\n--------------diposite---------------");
                            m.mydata();

                            d.depo();
                        }
                        case 2: {
                            System.out.println("\n----------------withdraw---------------");
                            // m.mydata();
                            c.with();
                        }
                        case 3: {
                            System.out.println("\n-------------checkbalance--------------");
                            // m.mydata();
                            c.display();

                        }
                        case 4: {
                            System.out.println("--------------transation------------------");
                            // t.tra();
                            break;
                        }
                        default: {
                            System.out.println("inavalid chocie");
                            break;
                        }

                    }
                    break;

                }
                case 3: {
                    System.out.println("\n\n-------------for loan----------------");
                    System.out.println("\n1.housing loan\n2.whical loan\n3.education loan\n4.cc loan");
                    System.out.println("\n enter choice ");
                    int ch3;
                    ch3 = sc.nextInt();
                    switch (ch3) {
                        case 1: {
                            System.out.println("\n\n-----------HOUSEING LOAN-----------");
                            System.out.println("=========================================");
                            System.out.println("\nhow many ruppes you want to loan:-enter amount");
                            int a, i;
                            int r = 5;
                            a = sc.nextInt();
                            System.out.println("\nyou are put loan for this ruppes is:" + a);
                            System.out.println("\nfor your information you can get monthly intresr for laon");
                            i = a * 5 / 100;
                            System.out.println("your mothly intrest is=" + i);
                            break;
                        }
                        case 2: {
                            System.out.println("\n\n-----------WHICAL LOAN---------------");
                            System.out.println("==========================================");
                            System.out.println("\nhow many ruppes you want to loan:-enter amount");
                            int a, i;
                            a = sc.nextInt();
                            System.out.println("\nyou are put loan for this ruppes is:" + a);
                            System.out.println("\nfor your information you can get monthly intresr for laon");
                            i = a % 10;
                            System.out.println("your mothly intrest is=" + i);
                            break;

                        }
                        case 3: {
                            System.out.println("\n\n------------EDUCATION LOAN-----------");
                            System.out.println("=========================================");
                            System.out.println("\nhow many ruppes you want to loan:-enter amount");
                            int a, i;
                            a = sc.nextInt();
                            System.out.println("\nyou are put loan for this ruppes is:" + a);
                            System.out.println("\nfor your information you can get monthly intresr for laon");
                            i = a % 10;
                            System.out.println("your mothly intrest is=" + i);
                            break;

                        }
                        case 4: {
                            System.out.println("\n\n-------------CC LOAN-----------------");
                            System.out.println("=========================================");
                            System.out.println("\nhow many ruppes you want to loan:-enter amount");
                            int a, i;
                            a = sc.nextInt();
                            System.out.println("\nyou are put loan for this ruppes is:" + a);
                            System.out.println("\nfor your information you can get monthly intresr for laon");
                            i = a % 10;
                            System.out.println("your mothly intrest is=" + i);
                            break;
                        }
                        default: {
                            System.out.println("invalid chocie");
                            break;
                        }
                    }

                }

            }
        } while (choice != 3);

    }

}