package Giocattolaio.Giocattolaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cliente
{
    private static List<Cliente> listaClienti = new ArrayList<>();
    
    private int id = 1; 
    private String nome; 
    private String email;
    private List<Giocattolo> giochiCliente = new ArrayList<>(); 

    // Lista che salva il numero di acquisti di un cliente
    List<Giocattolo> numeroAcquisti = new ArrayList<>();


    // Costruttore
    public Cliente(String nome, String email) {
        id++; 
        this.nome = nome;
        this.email = email; 
    }

    // Getter & Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 
    public static List<Cliente> getListaClienti() {
        return listaClienti;
    }
    public static void setListaClienti(List<Cliente> listaClienti) {
        Cliente.listaClienti = listaClienti;
    }


    // Metodo per acquistare giochi
    public void acquistaGioco()
    {
        System.out.println("Che giocattolo vuoi acquistare? ");
        for (Giocattolo giocattolo : Inventario.listaGiocattoli)
        {
            System.out.println(giocattolo.getNome() + " " + giocattolo.getPrezzo());
        }
        Scanner scanner = new Scanner(System.in);
        String scelta = scanner.nextLine();

        for (Giocattolo giocattolo : Inventario.listaGiocattoli)
        {
            if (giocattolo.getNome().equals(scelta))
            {
                if (giocattolo.getDisponibilita() > 0)
                {
                    System.out.println("Giocattolo acquistato con successo");
                    giochiCliente.add(giocattolo);
                    numeroAcquisti.add(giocattolo);
                    giocattolo.setDisponibilita(giocattolo.getDisponibilita() - 1);
                    break;
                }
                else
                {
                    System.out.println("Giocattolo non disponibile");
                    break;
                }
            }
        }
        scanner.close();

    }
    
    




    public List<Giocattolo> getGiochiCliente() {
        return giochiCliente;
    }

    public void setGiochiCliente(List<Giocattolo> giochiCliente) {
        this.giochiCliente = giochiCliente;
    }

    public List<Giocattolo> getNumeroAcquisti() {
        return numeroAcquisti;
    }

    public void setNumeroAcquisti(List<Giocattolo> numeroAcquisti) {
        this.numeroAcquisti = numeroAcquisti;
    }

    

    
}
