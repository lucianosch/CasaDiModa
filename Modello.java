public class Modello{
    private String nome;
    private double costoFisso;
    private double quantita;

public Modello(String nome,double costoFisso, double quantita){
    this.nome=nome;
    this.costoFisso=costoFisso;
    this.quantita=quantita;
}
public String getNome(){
    return nome;
}
public double getCostoFisso(){
    return costoFisso;
}
public double getQuantita(){
    return quantita;
}
public String toString() {
        return "Modello: " + this.nome + ", quantita': " + this.quantita + ", costo: " + this.costoFisso;
    }
}

