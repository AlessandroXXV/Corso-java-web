package Giocattolaio;


import java.util.List;

public class Vendita extends RegistroVendite{
    
    public Vendita(){

    }

    
    public static void aggiungiGiocattolo(Giocattolo giocattolo, Cliente cliente)
    {
        cliente.getGiochiCliente().add(giocattolo); 
    }

    @Override 
    void stampaListeClienti(List<Cliente> listaClienti) {
        for (Cliente cliente : listaClienti)
        {
            System.out.println(cliente.getGiochiCliente());
        }
        
    }

}
