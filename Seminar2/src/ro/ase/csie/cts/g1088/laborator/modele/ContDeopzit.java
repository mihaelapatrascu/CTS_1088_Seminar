package ro.ase.csie.cts.g1088.laborator.modele;

import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;
import ro.ase.csie.cts.g1088.laborator.interfete.Profitabil;

public class ContDeopzit extends ContBancar implements Profitabil {
    public static final double BALANTA_MINIMA = 100;
    public ContDeopzit(String iban){
        super(BALANTA_MINIMA, iban);
    }

    @Override
    public void alimenteazaCont(Double valoare) {
        this.balanta += valoare;
    }

    @Override
    public void extrage(Double valoare) throws ExceptieFonduriInsuficiente{
        if(this.balanta < valoare){
            throw new ExceptieFonduriInsuficiente("Fonduri insuficiente!");
        }
        else{
            this.balanta -= valoare;
        }
    }

    @Override
    public void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal{
        if(this == destinatie){
            throw new ExceptieTransferIlegal();
        }
        this.extrage(valoare);
        destinatie.alimenteazaCont(valoare);
    }

    @Override
    public void adaugaDobanda(double procentDobanda) {
        this.balanta *= (1+procentDobanda/100);
    }
}
