import java.util.Scanner;

public class EmailApp{
    public static void main(String[] args) {
        String first;
        String last;
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter First and Last name : \n");
        first= sc.nextLine();
        last= sc.nextLine();

        email eml =new email(first, last);
    }

   

}