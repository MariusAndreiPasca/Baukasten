package at_spengergasse;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("3 Parameter sind für den Quader notwendiig");
            return;
        }

        Quader quader = new Quader(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        System.out.println(quader.toString());

    }


}