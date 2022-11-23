import java.util.Scanner;

public class librarymanagement {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 'Name' and 'Rollno' to access your library account: ");
        String name=sc.nextLine();
        String Rollno=sc.nextLine();
        library obj1=new library(name,Rollno);
        obj1.menu();
    }
}

class library{
    int issueno;
    int prevEntry;
    String bookname;
    int bookcode;
    String customerName;
    String Rollno;
    int bal = 0;

    library(String customerName,String Rollno){
        this.customerName=customerName;
        this.Rollno=Rollno;
    }


    void issue(int amount, int bookcode1, String bookname1){
        if(amount!=0){
            bal+=amount;
            prevEntry=amount;
            bookcode = bookcode1;
            bookname = bookname1;
        }
    }

    void submition(int amt, int bookcode1, String bookname1){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevEntry=-amt;
            bookcode = bookcode1;
            bookname = bookname1;
        }
        else if(bal<amt){
            System.out.println("Please enter correct details");
        }
    }

    void getPreviousentry(){
        if(prevEntry>0){
            System.out.println("Submitted: "+prevEntry);
        }
        else if(prevEntry<0){
            System.out.println("Issued: "+Math.abs(prevEntry));
        }
        else{
            System.out.println("Nothing changed");
        }
    }

    void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID:"+Rollno);
        System.out.println("\n");
        System.out.println("a) Check Issued Books");
        System.out.println("b) Submit Book");
        System.out.println("c) Issue Book");
        System.out.println("d) Previous History");
        System.out.println("e) Exit");

        do{
            System.out.println("********************************************");
            System.out.print("Choose an option");
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("Number of issued books ="+bal);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter the number of books to be submitted :");
                    System.out.println("......................");
                    int amt=sc.nextInt();
                    System.out.println("Enter a bookcode :");
                    System.out.println("......................");
                    int bookcode=sc.nextInt();
                    System.out.println("Enter a bookname :");
                    System.out.println("......................");
                    String bookname=sc.next();
                    submition(amt,bookcode,bookname);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter a no of books to be issued :");
                    int amtW=sc.nextInt();
                    System.out.println("......................");
                    System.out.println("Enter a bookcode :");
                    bookcode=sc.nextInt();
                    System.out.println("......................");
                    System.out.println("Enter a bookname :");
                    bookname = sc.next();
                    System.out.println("......................");
                    issue(amtW,bookcode,bookname);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Entry:");
                    getPreviousentry();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }while(option!='e');

        System.out.println("Thank you");
    }

}
