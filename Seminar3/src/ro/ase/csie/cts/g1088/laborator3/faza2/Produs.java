package ro.ase.csie.cts.g1088.laborator3.faza2;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {
    public static final int VECHIME_CLIENT_MAXIMA = 10;
    public static final float DISCOUNT_CLIENT_MAXIM = (float) 0.15;

    public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
        if(pretInitial <= 0){
            throw new ExceptiePretInvalid();
        }
    }

    public static void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient {
        if(vechimeClientInAni < 0){
            throw new ExceptieVechimeClient();
        }
    }

    public static float getDiscountFidelitate(int vechimeClientInAni){
        return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
    }

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient {
        validarePret(pretInitial);
        validareVechime(vechimeClientInAni);

        float discount = TipProdus.NOU.getDiscount();
        float pretFinal = 0;
        float discountFidelitate = getDiscountFidelitate(vechimeClientInAni);

        switch (tipProdus){
            case NOU:
                pretFinal = pretInitial;
                break;
            case DISCOUNT:
                discount = TipProdus.DISCOUNT.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount* pretInitial));
                break;
            case STOC_LIMITAT:
                discount = TipProdus.STOC_LIMITAT.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
                break;
            case VECHI:
                discount = TipProdus.VECHI.getDiscount();
                pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (discount * pretInitial));
                break;
            default:
                throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat!");
        }

        return pretFinal;
    }
}