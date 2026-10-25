/*
 * ZADATAK 6 (ZA DOMA) – Račun u kafiću
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Društvo od 4 osobe naručilo je:
 *   3 kafe po 2.50 KM,  2 soka po 3.20 KM  i  1 kolač po 4.80 KM
 *
 *   a) izračunajte ukupan iznos računa (double)                      -> 18.70 KM
 *   b) cijene već sadrže PDV od 17%. Izračunajte osnovicu i iznos PDV-a:
 *        osnovica = ukupno / 1.17;     pdv = ukupno - osnovica;      -> 15.98 KM i 2.72 KM
 *   c) dodajte napojnicu od 10% na ukupan iznos                      -> 20.57 KM
 *   d) podijelite iznos sa napojnicom na 4 osobe                     -> 5.14 KM po osobi
 *   e) koliko KM plaća svaka osoba ako se zaokruži NAVIŠE na cijeli KM? -> 6 KM
 *      (pomoć: Math.ceil(...) zaokružuje naviše; rezultat je double -> pretvorite u int)
 *   f) koristite konstante:  final double PDV = 0.17;  final int BROJ_OSOBA = 4;
 *   g) ispišite uredan račun sa 2 decimale:  System.out.printf("Ukupno: %.2f KM%n", ukupno);
 *      PAŽNJA: sam znak % u printf-u pišete kao %%   ->   printf("PDV 17%%: %.2f KM%n", pdv);
 */
public class Zadatak6RacunKafic {

    public static void main(String[] args) {

        final double PDV = 0.17;
        final int BROJ_OSOBA = 4;

        double ukupno = 3 * 2.50 + 2 * 3.20 + 1 * 4.80;

        double osnovica = ukupno / (1 + PDV);
        double pdv = ukupno - osnovica;

        double napojnica = ukupno * 1.10;

        double poOsobi = napojnica / BROJ_OSOBA;

        int poOsobiZaokruzeno = (int) Math.ceil(poOsobi);

        System.out.println("===== RAČUN =====");
        System.out.printf("Ukupno: %.2f KM%n", ukupno);
        System.out.printf("Osnovica: %.2f KM%n", osnovica);
        System.out.printf("PDV 17%%: %.2f KM%n", pdv);
        System.out.printf("Ukupno sa napojnicom : %.2f KM%n", napojnica);
        System.out.printf("Po osobi: %.2f KM%n", poOsobi);
        System.out.println("Po osobi : " + poOsobiZaokruzeno + " KM");

    }
}
