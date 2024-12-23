
import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Exception_Exception;
import proxy.Compte;
import java.util.List;

public class ClientWS 
{
    public static void main(String[] args) throws Exception_Exception {
        BanqueServiceService service = new BanqueServiceService();
        BanqueWS stub =  service.getBanqueWSPort();
        
        double montant = stub.convertToDH(10);
        Compte compte = stub.getCompte(1);
        List<Compte> comptes = stub.getComptes();
        
        System.out.println("10 EURO = " + montant + " DH");

        System.out.println();
        System.out.println();

        System.out.println("Information du compte 1");
        printCompteInfo(compte);

        System.out.println();
        System.out.println();

        System.out.println("Autres Comptes : ");
        for(Compte c : comptes){
            printCompteInfo(c);
            System.out.println();
        }
    }

    private static void printCompteInfo(Compte compte)
    {
        System.out.println("Code : " + compte.getCode());
        System.out.println("Solde : " + compte.getSolde());
    }
}
