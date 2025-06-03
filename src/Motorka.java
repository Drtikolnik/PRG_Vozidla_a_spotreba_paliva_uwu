import java.util.*;

public class Motorka extends Vozidlo{
    static Scanner sc = new Scanner(System.in);


    private boolean mozneRiditOdSestnacti;

    public Motorka() {
        super();
        System.out.println("Je možné řídit motorku od 16 let? (ano/ne)");
        String vyber = sc.nextLine();
        vyber.toLowerCase();
        if (vyber.equals("ano")) {
            this.mozneRiditOdSestnacti = true;
        }
        else{
            this.mozneRiditOdSestnacti = false;
        }

    }



    public void vypisInfo(){
        System.out.print("Motorka je značky " +getZnacka()+ ", má spotřebu " +getSpotreba()+ "l/100km, a  ");
        if (mozneRiditOdSestnacti){
            System.out.print("je jí možné řídit od 16 let");
        }else{
            System.out.print("není jí možné řídit od 16 let");
        }
    }






}
