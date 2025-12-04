import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Teacher t = new Teacher("Saikat","Math","physics","Computer","Raj",
               "Batch-1 01","Rafi","Batch2-01","Sadik","Batch3-3","Sanjid");
        t.teachersInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher name : ");
        String te = sc.nextLine();

        if(te.equalsIgnoreCase("Saikat")){
            System.out.println("Teacher found.");
            System.out.println("CR name is : "+t.getCrName());
        }else{
            System.out.println("Teacher's name not found.");
        }
        System.out.println(" ");

    }
}