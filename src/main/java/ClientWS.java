
import mypackage.BanqueService;
import mypackage.BanqueWS;
import mypackage.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(" mantant apres convertion "+ stub.convert(10));
        Compte cp=stub.getCompte(5);
        System.out.println("Code "+ cp.getCode());
        System.out.println("Solde "+cp.getSolde());
    }
}