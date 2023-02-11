import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String jmeno = "Frantisek";  // Jméno prodejce
        String prijmeni = "Koudelka";  // Příjmení prodejce
        LocalDate narozen = LocalDate.of(1952, 3, 2);  // Datum narození prodejce.
        int pocetSjednanychSmluv = 5;  // Počet dosud sjednaných smluv.
        double prodaneMrkve = 1.64;  // Celkové množství prodané mrkve v tunách.
        String sidelniMesto = "Chvojkovice-Brod";  // Název města, kde prodejce sídlí.
        String SPZ = "1A2-5203";  // Registrační značka vozidla („SPZ“).
        double spotrebaVozidla = 8.2;  // Spotřeba firemního vozidla v litrech na 100 km.
        String IPAddrFiremnihoPC = "10.145.130.12"; // IP adresa verze 4 firemního počítače.
        double prumerProdanehoNaSmlouvu = prodaneMrkve/pocetSjednanychSmluv;

        System.out.println("# Evidence prodejcu:");
        System.out.println("* Prodejce: " + prijmeni + ", " + jmeno + " | *"  + narozen + " | " + sidelniMesto + ":");
        System.out.println("  *(IP firemniho PC: " + IPAddrFiremnihoPC + ", vozidlo: [SPZ: " + SPZ + ", " +
                           "spotreba: " + spotrebaVozidla + "])*");
        System.out.println("  - sjednanych smluv: " + pocetSjednanychSmluv);
        System.out.println("  - prodano         : " + prodaneMrkve + " tun mrkve");
        System.out.println("  - na jednu smlouvu bylo prumerne prodano " +
                            String.format("%.2f", prumerProdanehoNaSmlouvu) + " tun mrkve");

    }
}
