import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Vozidlo> vozidlo = new ArrayList<>();

        for (boolean behZapisu = true; behZapisu == true; ) {

            System.out.println("CO CHCEŠ ZADAT?");
            System.out.println("1 - PŘIDAT VOZIDLO");
            System.out.println("2 - VYPSAT VŠECHNA VOZIDLA");
            System.out.println("3 - SPOČÍTAT SPOTŘEBU VŠECH VOZIDEL NA 150 KM");
            System.out.println("4 - KONEC PROGRAMU");

            int vyber = sc.nextInt();
            sc.nextLine();
            switch (vyber) {

                case 1:
                    System.out.println("CO CHCEŠ ZADAT?");
                    System.out.println("1 - AUTO");
                    System.out.println("2 - MOTORKA");

                    int vyberVozidlo = sc.nextInt();
                    sc.nextLine();
                    switch (vyberVozidlo) {
                        case 1:
                            vozidlo.add(new Auto());
                            break;



                        case 2:
                            vozidlo.add(new Motorka());
                            break;
                    }
                    break;





                case 2:
                    //VŠECHNA VOZIDLA
                    System.out.println("Výpis všech vozidel:");
                    for (Vozidlo vo : vozidlo) {
                        vo.vypisInfo();
                        System.out.println("");
                    }
                    break;

                case 3:
                    //SPOČÍTÁNÍ SPOTŘEBY

                    for(Vozidlo vo : vozidlo){

                        vo.vypisInfo();
                        System.out.println(" - Spotřeba " +vo.vypocitejSpotrebu(150)+ "l");

                    }




                    break;

                case 4:
                    behZapisu = false;
                    break;


            }




        }












    }
}