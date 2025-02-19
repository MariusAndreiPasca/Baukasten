package at_spengergasse;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1 || args.length != 3) {
            System.out.println("1 Parameter für Würfel bzw. 3 Parameter für Quader notwendig");
            return;
        }
        if (args.length != 3) {
            System.out.println("3 Parameter sind für den Quader notwendiig");
            return;
        }
        if(args.length == 1) {
            Wuerfel wuerfel = new Wuerfel(Integer.parseInt(args[0]));
            System.out.println(wuerfel);
        }else if (args.length == 3){
            Quader quader = new Quader(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            System.out.println(quader);
        }

    }

}