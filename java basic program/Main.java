class student{
    String user_name;
    int roll_no;
    float marks;
    static int count=0;
    student(){
        this.user_name="renio jack";
        this.roll_no=23;
        this.marks=88.9f;
        count++;
    }
    student(String user_name,int roll_no,float marks){
        this.user_name=user_name;
        this.roll_no=roll_no;
        this.marks=marks;
        count++;
    }
}
class Main{
    public static void main(String[] args) {
        student reni=new student();
        student rahul=new student("srinidhi",23,33.3f);
        System.out.println(reni.user_name);
        System.out.println(reni.roll_no);
        System.out.println(reni.marks);
        System.out.println(rahul.user_name+"\n"+rahul.roll_no+"\n"+rahul.marks);
        System.out.println(student.count);

    }
}
