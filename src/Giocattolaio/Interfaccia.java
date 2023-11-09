package Giocattolaio;

import java.util.Scanner;

public class Interfaccia {

    public static void accessoAlSito()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao utente, se hai già un account inserisci Nome e Email, \n se sei nuovo registrati ");
        System.out.println("Effettua login --> 1");
        System.out.println("Effettua registrazione --> 2");
        System.out.println("Esci --> 3 \n");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                logInCliente();

                break;
            case 2:
                registratiCliente();
                logInCliente();
                break;
            case 3:
                System.out.println("Arrivederci");
                break;
        }
        scanner.close();
        
    }

    static void logInCliente()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN");
        System.out.println("Inserisci nome e email");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();


        boolean accessoRiuscito = false;

        if (nome.equals("AlessandroXXV") && email.equals("1234")) {
            System.out.println("Accesso ADMIN effettuato");
            operazioniAdmin();
            accessoRiuscito = true;
        } else {
            for (Cliente cliente : Cliente.getListaClienti()) {
                if (nome.equals(cliente.getNome()) && email.equals(cliente.getEmail())) {
                    System.out.println("Accesso effettuato");
                    operazioniCliente(cliente);
                    accessoRiuscito = true;
                    break; // Esci dal ciclo una volta trovata una corrispondenza
                }
            }
        }

        if (!accessoRiuscito) {
            System.out.println("Username o password errati, Ritornerai al menu principale \n");
            accessoAlSito();
        }
        //scanner.close();
    }


    
    static Cliente registratiCliente() {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("REGISTRAZIONE");
        System.out.println("Inserisci nome ed email");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email);
        Cliente.getListaClienti().add(cliente);
        System.out.println("Registrazione completata \n");
        // scanner.close();
        return cliente; // Ritorna il cliente appena registrato
        
    }
    


    static void operazioniCliente(Cliente cliente)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi fare?");
        System.out.println("Visualizza prodotti --> 1");
        System.out.println("Acquista prodotti --> 2");
        System.out.println("Logout --> 62");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                Inventario.mostraInventario();
                operazioniCliente(cliente);
                break;
            case 2:
                Cliente.acquistaGioco(cliente);
                operazioniCliente(cliente);
                break;
            case 62:
                logout();
                break;
        }
        scanner.close();
    }

    static void operazioniAdmin ()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi fare?");
        System.out.println("Visualizza prodotti --> 1");
        System.out.println("Aggiungi prodotti --> 2");
        System.out.println("Rimuovi prodotti --> 3");
        System.out.println("Visualizza clienti --> 4");
        System.out.println("Logout --> 62");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                Inventario.mostraInventario();
                operazioniAdmin();
                break;
            case 2:
                Inventario.aggiungiGiocattolo();
                operazioniAdmin();
                break;
            case 3:
                Inventario.rimuoviGiocattolo();
                operazioniAdmin();
                break;
            case 4: 
            Vendita vendita = new Vendita();
                vendita.stampaListeClienti(Cliente.getListaClienti());
                break; 
            case 62:
                logout();
                break;
        }
        scanner.close();
    }

    static void logout()
    {
        System.out.println("Logout effettuato");
        accessoAlSito();
    }
    
}
