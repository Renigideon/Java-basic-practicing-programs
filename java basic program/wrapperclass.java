class student_details{
    int roll;
    String name;
    float marks;
    student_details(){
        this.roll=12;
        this.name="aflin";
        this.marks=55.6f;

    }
}
public class wrapperclass {
    public static void main(String[] args) {
     student_details reni=new student_details();
        System.out.println(reni.marks);
        System.out.println(reni.name);
        System.out.println(reni.roll);

    }
}
