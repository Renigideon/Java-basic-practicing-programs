import java.util.Scanner;
public class avg_per {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        greet_intro();
        System.out.print("Enter the tamil mark: ");
        float tamil=in.nextFloat();
        System.out.print("Enter the english mark: ");
        float english=in.nextFloat();
        System.out.print("Enter the maths mark: ");
        float maths=in.nextFloat();
        System.out.print("Enter the science mark: ");
        float science=in.nextFloat();
        System.out.print("Enter the social mark: ");
        float social=in.nextFloat();
        float avg=average_of_student(tamil,english,maths,science,social);
        float per=percentage_of_student(tamil,english,maths,science,social);
        float mar=total_marks(tamil,english,maths,science,social);
        System.out.print("THE TOTAL MARKS OF THE STUDENTS: "+mar);
        System.out.print("THE AVERAGE OF THE STUDENTS PERFORMANCE IN EXAMINATIONS: "+avg);
        System.out.println();
        System.out.println("THE PERCENTAGE OF THE STUDENTS PERFORMANCE IN EXAMINATIONS: "+per);
        greet_outro();
    }
    static void greet_intro(){
        System.out.println("**************************************************************************************************************************************************************************************************************");
        System.out.println("                                              CALCULATION OF STUDENTS PERFORMANCE           ");
    }
    static float total_marks(float tamil, float english, float maths, float science, float social_science) {
        float marks = (tamil + english + maths + science + social_science / 5);
        return marks;
    }
    static float average_of_student(float tamil, float english, float maths, float science, float social_science) {
        float avg = (tamil + english + maths + science + social_science / 5);
        return avg;
    }

    static float percentage_of_student(float tamil, float english, float maths, float science, float social_science) {
        float per =  ((tamil + english + maths + science + social_science) / 500 * 100);
        return  per;
    }
    static void greet_outro(){
        System.out.println("**********************************************************************************************************************************************************************************************************************");
    }
}