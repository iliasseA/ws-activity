package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.lang.Math;
import java.util.List;
import java.util.Date;

//< >
@WebService(name="BanqueWS")
public class BanqueService 
{
    @WebMethod(operationName = "convertToDH")
    public double convert(@WebParam(name = "montantEuro") double mt) throws Exception {
        if(mt < 0){
            throw new Exception("Le montant doit être un nombre positif");
        }

        return mt * 10.46;
    }

    @WebMethod
    public Compte getCompte(int code)
    {
        return new Compte(code, Math.random() * 10000, new Date());
    }

    @WebMethod
    public List<Compte> getComptes()
    {
        return List.of(
                new Compte(101, Math.random() * 10000, new Date()),
                new Compte(102, Math.random() * 10000, new Date()),
                new Compte(103, Math.random() * 10000, new Date())
        );
    }
}
