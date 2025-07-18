class student1{
    String user_name;
    int roll_no;
    float marks;
//    student(){
//        this.user_name="renio jack";
//        this.roll_no=23;
//        this.marks=88.9f;
//    }
    student1(String user_name,int roll_no,float marks){
        this.user_name=user_name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    student1(){
        this("reni giden",23,99.5f);
    }
}
public class tutorial {
    public static void main(String[] args) {
       student1 reni=new student1("reni",23,44.5f);
       student1 rahul=new student1();
        System.out.println(rahul.user_name);
        System.out.println(reni.user_name);
    }
}
