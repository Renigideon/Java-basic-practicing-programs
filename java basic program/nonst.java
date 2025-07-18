public class nonst {

        static int a=10;
        static int b=5;
        static {
            b = b * 5;
        }

    public static void main(String[] args) {
        nonst sham=new nonst();
                System.out.println(nonst.a);
                System.out.println(nonst.b);
         nonst.a=23;
         nonst.b=89;
        System.out.println(nonst.a);
        System.out.println(nonst.b);

    }

}