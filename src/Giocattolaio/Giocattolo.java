package Giocattolaio;

public class Giocattolo {
    private static Integer id = 1; 
    private String nome; 
    private double prezzo; 
    private int etaConsigliata;
    private int disponibilita; 

    public Giocattolo(String nome, double prezzo, int etaConsigliata, int disponibilita) {
        id++;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        this.disponibilita = disponibilita; 
    }
    
    @Override
    public String toString() {
        String descrizione="";
        descrizione += "Nome Giocattolo: " + this.getNome();
        descrizione += "Età consigliata: " + this.getEtaConsigliata();
        descrizione += "\nPrezzo Euro: " + this.getPrezzo();
        return descrizione;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }

    public static void setId(Integer id) {
        Giocattolo.id = id;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }     

    
    
}