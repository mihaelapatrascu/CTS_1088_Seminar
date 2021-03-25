package ro.ase.csie.g1088.dp.singleton;

public class ModulProfil {

    public  ModulProfil(){
        ConexiuneBD conexiune = ConexiuneBD.getConexiune();
    }
}
