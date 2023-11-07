package Giocattolaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends RegistroVendite{
    private int id = 1; 
    private String nome; 
    private String email;
    private List<Giocattolo> giochiCliente = new ArrayList<>(); 

    // Lista che salva il numero di acquisti di un cliente
    List<Giocattolo> numeroAcquisti = new ArrayList<>();

    // Lista che memorizza il numero di clienti
    List<Cliente> listaClienti = new ArrayList<>(); 

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

    // Metodo per acquistare giochi
    public void acquistaGioco(Giocattolo giocattolo, Cliente cliente)
    {
        Scanner scanner = new Scanner(System.in); 
        double denaro;
        int eta; 
        System.out.print("Quanto denaro hai? ");
        denaro = scanner.nextDouble(); 
        System.out.print("Inserisci la tua eta...");
        eta = scanner.nextInt(); 

        // se il cliente ha il denaro e l'età minima può comprare il gioco, se c'è disponibilità del gioco
        if((denaro >= giocattolo.getPrezzo()) && (eta >= giocattolo.getEtaConsigliata()) && giocattolo.getDisponibilita() > 0)
        {
            System.out.println("Gioco acquistato con successo!");
            // L'acquisto aggiunge il gioco ad una lista nella classe "Vendita"
            Vendita.aggiungiGiocattolo(giocattolo, cliente);   
            giocattolo.setDisponibilita(eta--); 
        }else 
        {
            System.out.println("L'acquisto non e' andato a buon fine");
        }


    }

    @Override
    void stampaListeClienti() {
        for (Cliente cliente)
        
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
