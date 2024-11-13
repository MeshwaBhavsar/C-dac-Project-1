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

public class bankaap {
    public static void main(String[] args) {
        deposite d = new deposite();
        ab a = new ab();
        a.getdata();
        int choice, ch1, ch, ch2, ch3;
        int balance;
        final int ac_no = 1234;
        int ac;
        // System.out.println("\n1 LOGIN \n2.ALREADY LOGIN");
        // System.out.println("\nEnter Choice");
        // Scanner sc = new Scanner(System.in);
        // choice = sc.nextInt();
        String username;
        int password;
        do {
            System.out.println("\n1 LOGIN \n2.ALREADY LOGIN\n3.Exit");
            System.out.println("\nEnter Choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
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

                    switch (ch1) {
                        case 1: {
                            String name, email, address, type;
                            int bd, mono, sal;
                            System.out.println("\n----------------OPEN NEW ACCOUNT-----------");
                            System.out.println("\n\nenter full name ");
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
                            switch (ch) {
                                case 1: {
                                    String n, nb, o, ans;
                                    // final int ac_no=12345;
                                    System.out.println("\n\n***********SAVING ACCOUNT*********");
                                    System.out
                                            .println("\n\nplease fill the below form and attach below requirment");
                                    System.out.println("\n*(2)photos \n*pan card\n* aadharcard\n* GST copy");
                                    System.out.println("\n\nenter name of customer");
                                    n = sc.next();
                                    // System.out.println("\n enter AC_No " + "\n" + ac_no);

                                    System.out.println("\n enter name of bank branch");
                                    nb = sc.next();
                                    System.out.println("\nenter your occupation");
                                    o = sc.next();
                                    System.out.println("\nrequest for ATM debit card : yes/no");
                                    ans = sc.next();
                                    System.out.println("\nenter ac_no");
                                    ac = sc.nextInt();
                                    if (ac == ac_no) {
                                        System.out.println("enter amount");
                                    } else {
                                        System.out.println("plase try again");
                                    }
                                    // System.out.println("\nplease enter amount");
                                    balance = sc.nextInt();
                                    System.out.println(".......................................");
                                    System.out.println("NAME OF CUSTOMER : " + n);
                                    System.out.println("Ac_No : " + ac_no);
                                    System.out.println("BANK BRANCH NAME : " + nb);
                                    System.out.println("OCCUPATION : " + o);
                                    System.out.println("YOUR ANS : " + ans);
                                    System.out.println("BALANCE : " + balance);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("...............Thank You................");
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    break;
                                }
                                case 2: {
                                    String n, nb, o, ans, b;
                                    // final int ac_no=12345;
                                    System.out.println("\n\n*********CURRENT ACCOUNT*********");
                                    System.out
                                            .println("\n\nplease fill the below form and attach below requirment");
                                    System.out.println(
                                            "\n*(2)photos \n*pan card\n* aadharcard\n* GST copy\n*business pruf");
                                    System.out.println("\n\nenter name of customer");
                                    n = sc.next();
                                    // System.out.println("\n enter AC_No " + "\n" + ac_no);
                                    System.out.println("\n enter name of bank branch");
                                    nb = sc.next();
                                    System.out.println("\nenter your occupation");
                                    o = sc.next();
                                    System.out.println("\n enter your business ");
                                    b = sc.next();
                                    System.out.println("\nrequest for ATM debit card : yes/no");
                                    ans = sc.next();
                                    System.out.println("\nenter ac_no ");
                                    ac = sc.nextInt();
                                    if (ac == ac_no) {
                                        System.out.println("\nenter amount for deposite");

                                    } else {
                                        System.out.println("\n please try again");
                                    }
                                    // System.out.println("\nplease enter amount");
                                    balance = sc.nextInt();
                                    System.out.println(".......................................");
                                    System.out.println("NAME OF CUSTOMER : " + n);
                                    System.out.println("Ac_No : " + ac_no);
                                    System.out.println("BANK BRANCH NAME : " + nb);
                                    System.out.println("OCCUPATION : " + o);
                                    System.out.println("BUSINESS :" + b);
                                    System.out.println("YOUR ANS : " + ans);
                                    System.out.println("BALANCE : " + balance);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n............Thank You................");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    break;
                                }
                                case 3: {
                                    String n, nb, o, ans;
                                    // final int ac_no=12345;
                                    System.out.println("\n\n*********RECURING ACCOUNT*********");
                                    System.out
                                            .println("\n\nplease fill the below form and attach below requirment");
                                    System.out.println("\n*(2)photos \n*pan card\n* aadharcard");
                                    System.out.println("\n\nenter name of customer");
                                    n = sc.next();
                                    // System.out.println("\n enter AC_No " + "\n" + ac_no);
                                    System.out.println("\n enter name of bank branch");
                                    nb = sc.next();
                                    System.out.println("\nenter your occupation");
                                    o = sc.next();
                                    System.out.println("\nrequest for ATM debit card : yes/no");
                                    ans = sc.next();
                                    System.out.println("\nenter ac_no ");
                                    ac = sc.nextInt();
                                    if (ac == ac_no) {
                                        System.out.println("\nenter amount for deposite");

                                    } else {
                                        System.out.println("\n please try again");
                                    }
                                    // System.out.println("\nenter amount");
                                    balance = sc.nextInt();
                                    System.out.println(".......................................");
                                    System.out.println("NAME OF CUSTOMER : " + n);
                                    System.out.println("Ac_No : " + ac_no);
                                    System.out.println("BANK BRANCH NAME : " + nb);
                                    System.out.println("OCCUPATION : " + o);
                                    System.out.println("YOUR ANS : " + ans);
                                    System.out.println("BALANCE : " + balance);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n................Thank You..............");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    break;
                                }
                                case 4: {
                                    String n, nb, o, ans;
                                    // final int ac_no=12345;
                                    System.out.println("\n\n*********MINOR-SAVING ACCOUNT*********");
                                    System.out
                                            .println("\n\nplease fill the below form and attach below requirment");
                                    System.out.println(
                                            "\n*(2)Photos \n*Prouf For School\n* Aadhar card\n*Birth Certificate");
                                    System.out.println("\n\nenter name of customer");
                                    n = sc.next();
                                    // System.out.println("\n enter AC_No " + "\n" + ac_no);
                                    System.out.println("\n enter name of bank branch");
                                    nb = sc.next();
                                    System.out.println("\nenter your education");
                                    o = sc.next();
                                    System.out.println("\nrequest for ATM debit card : yes/no");
                                    ans = sc.next();
                                    System.out.println("\nenter ac_no ");
                                    ac = sc.nextInt();
                                    if (ac == ac_no) {
                                        System.out.println("\nenter amount for deposite");

                                    } else {
                                        System.out.println("\n please try again");
                                    }
                                    // System.out.println("\nplease enter amount");
                                    balance = sc.nextInt();
                                    System.out.println(".......................................");
                                    System.out.println("NAME OF CUSTOMER : " + n);
                                    System.out.println("Ac_No : " + ac_no);
                                    System.out.println("BRANCH NAME : " + nb);
                                    System.out.println("OCCUPATION : " + o);
                                    System.out.println("YOUR ANS : " + ans);
                                    System.out.println("BALANCE : " + balance);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n..................Thank You..............");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                                    break;
                                }
                                default: {
                                    System.out.println("invalid chocie");
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("\n\n**********FOR TRAN**************");
                            System.out.println("\n1.Diposite\n2.Withdraw\n3.Check Balance\n4.Transation");
                            System.out.println("\nenter choice");
                            ch2 = sc.nextInt();
                            do {
                                switch (ch2) {
                                    case 1: {
                                        String na;
                                        System.out.println("**********DIPOSITE*************");
                                        System.out.println("enter name");
                                        na = sc.next();
                                        // System.out.println("\nenter Ac_NO " + ac_no);
                                        System.out.println("\nenter ac_no ");
                                        ac = sc.nextInt();
                                        if (ac == ac_no) {
                                            System.out.println("\nenter amount for deposite");

                                        } else {
                                            System.out.println("\n please try again");
                                        }
                                        // System.out.println("\n");
                                        d.dipo();

                                    }
                                    case 2: {
                                        String na;
                                        System.out.println("\n**********WITHDRAW*************");
                                        System.out.println("enter name");
                                        na = sc.next();
                                        // System.out.println("\nenter Ac_NO " + ac_no);
                                        System.out.println("\nenter ac_no ");
                                        ac = sc.nextInt();
                                        if (ac == ac_no) {
                                            System.out.println("\nenter amount for deposite");

                                        } else {
                                            System.out.println("\n please try again");
                                        }
                                        // System.out.println("\n");
                                        d.with();
                                    }
                                    case 3: {
                                        String na;
                                        System.out.println("\n**********CHECK BALANCE*************");
                                        System.out.println("enter name");
                                        na = sc.next();
                                        System.out.println("\nenter Ac_NO " + ac_no);
                                        // System.out.println("\n");
                                        d.checkbalance();
                                    }
                                    case 4: {
                                        String na;
                                        System.out.println("\n**********TRANSATION*************");
                                        System.out.println("enter name");
                                        na = sc.next();
                                        // System.out.println("\nenter Ac_NO " + ac_no);
                                        System.out.println("\nenter ac_no ");
                                        ac = sc.nextInt();
                                        if (ac == ac_no) {
                                            System.out.println("\nenter amount for transation");

                                        } else {
                                            System.out.println("\n please try again");
                                        }
                                        // System.out.println("\n");
                                        d.tr();
                                        break;

                                    }
                                    default: {
                                        System.out.println("not valid");
                                        break;
                                    }

                                }
                                break;
                            } while (ch2 != 4);
                        }

                        // break;
                        case 3: {
                            System.out.println("\n\n***************LOAN******************");
                            System.out.println(
                                    "\n\n1.Housing Loan\n2.Education Loan\n3.Vehical Loan\n4.Other Type Loan");
                            System.out.println("\n\nenter your choice");
                            ch3 = sc.nextInt();
                            switch (ch3) {
                                case 1: {
                                    String nam, e, ad;
                                    int birh, ruppes, c, i;
                                    System.out.println("\n\n------------HOUSING LOAN-------------");
                                    System.out.println("\nEnter Full Name");
                                    nam = sc.next();
                                    System.out.println("\nDate Of Birth");
                                    birh = sc.nextInt();
                                    System.out.println("\nEnter Email");
                                    e = sc.next();
                                    System.out.println("\nEnter Content Number");
                                    c = sc.nextInt();
                                    System.out.println("\nEnter Address");
                                    ad = sc.next();
                                    System.out.println("\nEenter Amount For Take Loan");
                                    ruppes = sc.nextInt();
                                    System.out.println("\n..........................................");
                                    System.out.println("\n...................CUSTOMER DETAILS................");
                                    System.out.println("\nFULL NAME : " + nam);
                                    System.out.println("DATE OF BIRTH : " + birh);
                                    System.out.println("EMAIL : " + e);
                                    System.out.println("CONTENT NUMBER : " + c);
                                    System.out.println("ADDRESS : " + ad);
                                    System.out.println("\n\n->Supporting Documents CheckList*");
                                    System.out.println(
                                            "\n1.Proof Of Income\n2.Proof Of Other Loan\n3.Compleate Budget Sheet");
                                    System.out.println("\nLOAN AMOUNT : " + ruppes);
                                    i = ruppes / 12;
                                    System.out.println("Your Monthy Paid Amount For Loan : " + i);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n*************Thank You*************");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

                                    break;

                                }
                                case 2: {
                                    String nam, e, ad, ed;
                                    int birh, ruppes, c, i;
                                    System.out.println("-------------EDUCATION LOAN-----------");
                                    System.out.println("\nenter full name of student");
                                    nam = sc.next();
                                    System.out.println("\ndate of birth");
                                    birh = sc.nextInt();
                                    System.out.println("\nenter email");
                                    e = sc.next();
                                    System.out.println("\nenter content number");
                                    c = sc.nextInt();
                                    System.out.println("\nenter address");
                                    ad = sc.next();
                                    System.out.println("\nfor what education can you take laon");
                                    ed = sc.next();

                                    System.out.println("\nenter amount for take loan");
                                    ruppes = sc.nextInt();
                                    System.out.println("\n..........................................");
                                    System.out.println("\n....................STUDENT'S DETAILS...............");
                                    System.out.println("\nFULL NAME : " + nam);
                                    System.out.println("DATE OF BIRTH : " + birh);
                                    System.out.println("EMAIL : " + e);
                                    System.out.println("CONTENT NUMBER : " + c);
                                    System.out.println("ADDRESS : " + ad);
                                    System.out.println("THIS EDUCATION FOR TAKE LOAN : " + ed);
                                    System.out.println("\n\n->Supporting Documents CheckList*");
                                    System.out.println(
                                            "\n1.Proof Of AdharCard\n2.Proof Of Student MarkSheet\n3.School Living");
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                                    System.out.println("\n--------------------Thank You-----------------");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                                    break;
                                }
                                case 3: {
                                    String nam, e, ad, m, com;
                                    int birh, ruppes, c, i, s, se;
                                    System.out.println("-------------VEHICAL LOAN-----------");
                                    System.out.println("\nenter full name");
                                    nam = sc.next();
                                    System.out.println("\ndate of birth");
                                    birh = sc.nextInt();
                                    System.out.println("\nenter email");
                                    e = sc.next();
                                    System.out.println("\nenter content number");
                                    c = sc.nextInt();
                                    System.out.println("\nenter address");
                                    ad = sc.next();
                                    System.out.println("\nenter monthly salary");
                                    s = sc.nextInt();
                                    System.out.println("\n enter no of year in service");
                                    se = sc.nextInt();
                                    System.out.println("\nenter vehical model");
                                    m = sc.next();
                                    System.out.println("\nenter company name");
                                    com = sc.next();
                                    System.out.println("\nenter amount for laon");
                                    ruppes = sc.nextInt();
                                    System.out.println("\n.........APPLICATION DETAILS................");
                                    System.out.println("\nNAME :" + nam);
                                    System.out.println("DATE OF BIRTH : " + birh);
                                    System.out.println("EMAIL : " + e);
                                    System.out.println("CONTENT NUMBER : " + c);
                                    System.out.println("ADDRESS : " + ad);
                                    System.out.println("MONTHLY SALARY :" + s);
                                    System.out.println("YEAR IN SERVICE :" + se);
                                    System.out.println("\n\n...........VIHICAL DETAILS..............");
                                    System.out.println("\nVEHICAL MODEL : " + m);
                                    System.out.println("COMPANY NAME :" + com);
                                    System.out.println("AMOUNT FOR LOAN : " + ruppes);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n-------------------Thank You---------------------");
                                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    break;

                                }
                                case 4: {
                                    String t;
                                    int rupees;
                                    System.out.println("\n\n----------OTHER TYPE LOAN---------");
                                    System.out.println("\nenter type for loan");
                                    t = sc.next();
                                    System.out.println("enter amount ");
                                    rupees = sc.nextInt();
                                    System.out.println("\nLOAN TYPE: " + t);
                                    System.out.println("AMOUNT :" + rupees);
                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("\n-------------------Thank You----------------------");
                                    System.out.println(
                                            "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
                                    break;

                                }
                            }

                        }
                    }

                }
                case 3: {
                    System.exit(0);
                }
            }
        } while (choice != 3);
    }
}