

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        List<Compte> compteList = proxy.listComptes();
        for (Compte c : compteList){
            System.out.println("----------------------");
            System.out.println("code = "+c.getCode());
            System.out.println("Solde = "+c.getSold());
            System.out.println("Date création = "+c.getDateCreation());
        }



    }
}
