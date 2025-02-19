package at_spengergasse;

public class Wuerfel extends Quader{
    public Wuerfel(int a) {
        super(a,a,a);
    }

    @Override
    public String toString() {
        return String.format("Wuerfel: a=%d, (VOL=%d).", a, volumen());
    }
}
