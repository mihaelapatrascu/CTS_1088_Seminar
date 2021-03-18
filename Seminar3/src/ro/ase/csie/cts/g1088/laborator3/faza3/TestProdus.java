package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.StrategieMarketing2021;

import java.util.ArrayList;

public class TestProdus {

    public static ArrayList<Object> servicii = new ArrayList<>();

    public void startUp(){
        InterfataMarketing serviciuMk = new StrategieMarketing2021();
        InterfataValidare serviciuValidare = new ServiciuValidari();
        servicii.add(serviciuValidare);
        servicii.add(serviciuMk);
    }

    public static void main(String[] args) {
        Produs produs = new Produs(new StrategieMarketing2021(), new ServiciuValidari());
        try {
            float pretFinal = produs.getPretFinal(TipProdus.DISCOUNT,100,12);
            System.out.println("Pret final "+ pretFinal);

            produs.setStrategieMarketing(new InterfataMarketing() {
                @Override
                public float getDiscountFidelitate(int vechimeClientInAni) {
                    return 0.3f;
                }
            });

            pretFinal = produs.getPretFinal(TipProdus.DISCOUNT,100,12);
            System.out.println("Pret final "+ pretFinal);

        } catch (ExceptiePretInvalid exceptiePretInvalid) {
            exceptiePretInvalid.printStackTrace();
        } catch (ExceptieVechimeClient exceptieVechimeClient) {
            exceptieVechimeClient.printStackTrace();
        }
    }
}
