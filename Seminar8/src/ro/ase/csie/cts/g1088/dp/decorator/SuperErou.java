package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class SuperErou {

    String nume;
    int puncteViata;

    public SuperErou(String nume, int puncreViata) {
        this.nume = nume;
        this.puncteViata = puncreViata;
    }

    public abstract void alearga();
    public abstract void esteLovit(int puncte);
    public abstract void seVindeca(int puncte);

    public int getPuncteViata() {
        return puncteViata;
    }
}
