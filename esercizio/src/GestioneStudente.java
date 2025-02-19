
    public class GestioneStudente {
        public static void main(String[] args) {
            // Creazione di un oggetto GestioneStudente.Studente
            Studente studente1 = new Studente("Alice", 20, "Informatica");

            // Stampa i dettagli dello studente
            studente1.mostraDettagli();

            // Modifica dell’età con il setter
            studente1.setEta(21);
            studente1.mostraDettagli(); // Dettagli aggiornati

            // Cambia il corso dello studente1
            studente1.cambiaCorso("Matematica");
            studente1.mostraDettagli(); // Dettagli dopo cambio corso

            // Creazione di un secondo oggetto GestioneStudente.Studente chiamato Bob
            Studente studente2 = new Studente("Bob", 22, "Fisica");
            studente2.mostraDettagli(); // Dettagli dello studente Bob

            // Prova a cambiare il corso con un valore non valido
            studente1.cambiaCorso(""); // Corso vuoto (errore)
            studente1.cambiaCorso(null); // Corso nullo (errore)
        }
    }

