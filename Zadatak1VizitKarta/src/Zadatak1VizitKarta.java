/*
 * ZADATAK 1 – Vizit karta
 * Programiranje u Javi – Auditorne vježbe, Sedmica 2
 *
 * Napišite program koji ispisuje vašu vizit kartu, na primjer:
 *
 *   ==============================
 *           VIZIT KARTA
 *   ==============================
 *   Ime:    Amar Hodžić
 *   Studij: Informatika
 *   Godina: 1.
 *   Moto:   "Kod je poezija."
 *   ==============================
 *
 * Uslovi:
 *   1) bar jednom koristite print (bez prelaska u novi red), a ne samo println
 *   2) za poravnanje koristite tabulator  \t
 *   3) moto mora biti pod navodnicima  ->  \"
 *
 * BONUS: ispišite cijelu karticu JEDNOM naredbom println (koristite \n).
 */
public class Zadatak1VizitKarta {

  public static void main(String[] args) {
    System.out.println("==============================");
    System.out.println("        VIZIT KARTA");
    System.out.println("==============================");
    System.out.print("Ime:\tAmar Sejfić\n");
    System.out.print("Studij:\tInformatika i računarstvo\n");
    System.out.print("Godina:\t3.\n");
    System.out.print("Moto:\t\"Kod je poezija.\"\n");
    System.out.println("==============================");

    System.out.println("==============================\n" +
                    "        VIZIT KARTA\n" +
                    "==============================\n" +
                    "Ime:\tAmar Sejfić\n" +
                    "Studij:\tInformatika i računarstvo\n" +
                    "Godina:\t3.\n" +
                    "Moto:\t\"Kod je poezija.\"\n" +
                    "==============================");

  }
}