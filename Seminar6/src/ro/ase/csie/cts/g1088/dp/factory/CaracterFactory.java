package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterFactory {

    public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
        CaracterAbstract caracter = null;

        switch (tip) {
            case DISNEY:
                caracter = new CaracterDisney("alb", nume,true);
                break;
            case MARVEL:
                caracter = new CaracterMarvel(100, nume);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return caracter;
    }
}
