public class Capo {
    private Modello modello;
    private Colore colore;
    private Materiale materiale;
//    private double costoFisso; 

//    public Capi(Modello modello, Colore colore, Materiale materiale, double costoFisso) {
    public Capo(Modello modello, Colore colore, Materiale materiale) {
        this.modello = modello;
        this.colore = colore;
        this.materiale = materiale;
    }

    public double prezzo() {
        return modello.getCostoFisso() + modello.getQuantita() * materiale.getPrezzo();
    }

    public String toString() {
        return modello.getNome() + " " + colore.getNomeC() + " di " + materiale.getNomeM() + "\n";
    }
    
    public Colore getColore(){
        return colore;
   }
}
