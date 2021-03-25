package ro.ase.csie.cts.g1088.dp.singleton.registru;

public class TestRegistruSingleton {
    public static void main(String[] args) {
        ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
        ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.2", "cts");

        if(conexiune1 == conexiune2){
            System.out.println("Referinte identice");
        }
        else{
            System.out.println("Refeinte diferite");
        }
    }
}
