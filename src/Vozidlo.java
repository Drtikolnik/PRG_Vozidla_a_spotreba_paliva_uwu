import java.util.*;

public abstract class Vozidlo {
    static Scanner sc = new Scanner(System.in);

    private String znacka;
    private double spotreba;


    public Vozidlo() {

        System.out.println("Jaká je značka?");
        znacka = sc.nextLine();
        this.znacka = znacka;

        System.out.println("Jaká je spotřeba? (l/100km)");
        spotreba = sc.nextDouble();
        sc.nextLine();
        this.spotreba = spotreba;

    }



    public double vypocitejSpotrebu(double vzdalenost) {
        return (spotreba/100) * vzdalenost;
    }

    public abstract void vypisInfo();










    public String getZnacka() {
        return znacka;
    }

    public double getSpotreba() {
        return spotreba;
    }
}
