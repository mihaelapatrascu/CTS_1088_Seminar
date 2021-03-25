package ro.ase.csie.g1088.dp.singleton.versiune.statica;

public class ConexiuneBD {

    private String ip;
    private String denumire;

    public static final ConexiuneBD conexiune;

    //se executa o singura data cand clasa e incarcata in masina virtuala
    static {
        //preluare date conexiune din alte surse
        String ip = "127.0.0.1";
        String denumire = "bdtest";
        conexiune = new ConexiuneBD(ip, denumire);
    }

    private ConexiuneBD(String ip, String denumire) {
        this.ip = ip;
        this.denumire = denumire;
    }
}
