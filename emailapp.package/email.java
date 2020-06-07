import java.util.Scanner;
public class email {
    private  String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity =300;
    private String alternateEmail="vnbharti56@gmail.com";
    private int defaulPasswordLength=9;
    private String compnaySuffix ="vinaybharti.com";

    public email(String firstName, String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
        this.alternateEmail=alternateEmail;
        System.out.println(" \nYour Name is :" +this.firstName+" "+this.lastName+ "\n");

        //call a method asking for the department return the department
        this.department=setDepartment();
        System.out.println("Department:-  " + this.department);

        //call a method that generate random password
    
        this.password=randomPassword(defaulPasswordLength);
        System.out.println("Your computer generated password is :- " + password);

        //combine elements to generate email
        String email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +department + "." +compnaySuffix;
        System.out.println("Your  computer generated Email is :- " + email);
        //call a method that tell the mailbox capicity
        this.mailboxCapacity=setMailboxCapcity();
        System.out.println("Your Mail Capacity is :-" + mailboxCapacity + "MB");

        //call a method that display alternate email
        this.setAlternateEmail();

    }
//Ask for department
    private String setDepartment(){
        System.out.println("Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n \nEnter Department Code:");
    Scanner in = new Scanner(System.in);
    int choice=in.nextInt();
    if(choice==1){ return "Sales";}
    else if(choice==2){return "Development";}
    else if(choice==3){return "Accounting";}
    else {return " ";}
    }

    //genearte random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#!$";
        char[]password= new char[length];
        for(int i=0;i<length;i++){
            int random=(int) (Math.random() *passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }
        return new String(password);

    }
    //Set the mail
    private int setMailboxCapcity()
    {
        return mailboxCapacity;

    }
    private void setAlternateEmail()
    {
       System.out.println("Your Alternate email is :- " + alternateEmail);

    }
    
    
}