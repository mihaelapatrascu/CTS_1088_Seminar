package ro.ase.csie.cts.g1088.dp.prototype;

import ro.ase.csie.cts.g1088.dp.prototype.Caracter3D;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        Caracter3D c1 = new Caracter3D("model1.sd");
//        Caracter3D c2 = new Caracter3D("model2.sd");
//        Caracter3D c3 = new Caracter3D("model3.sd");

        Caracter3D c2 = (Caracter3D) c1.clone();
        Caracter3D c3 = (Caracter3D) c1.clone();

        System.out.println("Sfarsit");
    }
}
