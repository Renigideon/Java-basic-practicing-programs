import java.util.Scanner;

public class fees_structure {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the fees: ");
        float fees=in.nextInt();
        System.out.print("Enter the number of students: ");
        float students=in.nextInt();
      float total_fees=fees_from_students(fees,students);
        System.out.println("--------------------------------------------------------------------------------------");
      System.out.println("enter the teacher amount: ");
       float teach=in.nextInt();
        System.out.println("enter the total fees of the class: ");
       float fees_of_individual_student=in.nextInt();
        float section_fees_students=section_fees(teach,fees_of_individual_student);
        System.out.println("fees of students:"+total_fees);
        System.out.println("class fees: "+section_fees_students);
    }
    static float fees_from_students(float fees,float students){

        return students*fees;
    }
    static float section_fees(float teach,float fees_of_individual_student){


       return teach*fees_of_individual_student;
    }
}
