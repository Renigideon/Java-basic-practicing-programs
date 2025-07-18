class info {
    public <T> void name(T name) {
        System.out.println(name);
    }

    public <T> void age(T age) {
        System.out.println(age);
    }
}
    public class generics{
        public static void main(String[] args) {
            info in=new info();
            in.name(2323);
            in.age("srinidhi thevidiya");
        }
    }

