import java.util.ArrayList;
import java.util.List;

public class Zespol {
    public static void main(String[] args) {
        Muzyk muzyk1 = new Muzyk("nergal", "fujarka", "dddd");
        Muzyk muzyk2 = new Muzyk("skawinski", "gitarzysta", "Dddd");
        Muzyk muzyk3 = new Muzyk("aga", "wokal", "dddd");
        Muzyk muzyk4 = new Muzyk("pilichowski", "bas", "ddd");
        Muzyk muzyk5 = new Muzyk("dąbrówka", "perka", "ddd");

        List<Muzyk> listaMuzyków = new ArrayList<>();
        listaMuzyków.add(muzyk1); //0
        listaMuzyków.add(muzyk2); //1
        listaMuzyków.add(muzyk3); //2
        listaMuzyków.add(muzyk4); //3
        listaMuzyków.add(muzyk5); //4

        System.out.println(listaMuzyków.get(4).ksywa + " " + listaMuzyków.get(4).instrument);
        System.out.println(listaMuzyków.get(4).ksywa + " " + listaMuzyków.get(4).instrument);
    }

}




