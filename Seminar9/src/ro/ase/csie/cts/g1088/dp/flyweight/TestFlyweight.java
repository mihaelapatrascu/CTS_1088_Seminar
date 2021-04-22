package ro.ase.csie.cts.g1088.dp.flyweight;

public class TestFlyweight {

    public static void main(String[] args) {

        DateEcran soldat1 = new DateEcran(100, 50, 50, "verde");
        DateEcran soldat2 = new DateEcran(100, 50, 50, "rosu");
        DateEcran cladire1 = new DateEcran(10, 10, 10, "gri");
        DateEcran cladire2 = new DateEcran(150, 50, 50, "maro");

        InterfataFlyweightModel3D modelSoldat =
                Model3DFactory.getModel3D(TipModel3D.SOLDAT);
        modelSoldat.afisareEcran(soldat1);
        modelSoldat.afisareEcran(soldat2);

        Model3DFactory.getModel3D(TipModel3D.CLADIRE).
                afisareEcran(cladire1);
        Model3DFactory.getModel3D(TipModel3D.CLADIRE).
                afisareEcran(cladire2);

    }
}
