package at_spengergasse;


public class Quader extends Object{
    int a, b, c;

    public Quader(int a, int c, int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public int volumen() {
        return a*b*c;
    }

    @Override
    public String toString() {
        return String.format("Quader: a=%d, b=%d, c=%d, (VOL=%d).", a, b, c, volumen());
    }
}
