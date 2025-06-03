public class Auto extends Vozidlo{

    private int pocetSedadel;

    public Auto() {
        super();
        System.out.println("Jaký je počet sedadel?");
        pocetSedadel = sc.nextInt();
        sc.nextLine();
        this.pocetSedadel = pocetSedadel;

    }



    public void vypisInfo(){
        System.out.print("Auto je značky " +getZnacka()+ ", má spotřebu " +getSpotreba()+ "l/100km, a počet sedadel " +getPocetSedadel());
    }


    public int getPocetSedadel() {
            return pocetSedadel;
    }


















}
