import java.util.ArrayList;
import java.util.List;

class inform {
     public <T> void name(T name) {
         System.out.println(name);
     }

     public <T> void age(T age) {
         System.out.println(age);
     }
     public void Listelement(List<?> elementlist){
         System.out.println(elementlist.get(0));
     }
 }
    public class infor{
        public static void main(String[] args) {
            inform in=new inform();
            in.name(2323);
            in.age("srinidhi thevidiya");
            List<Integer> inte=new ArrayList<>();
            inte.add(34);
            List<String> lte=new ArrayList<>();
            lte.add("english");
            in.Listelement(inte);
            in.Listelement(lte);
        }
    }

