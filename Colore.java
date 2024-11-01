public class Colore{
    private String nome;
    

public Colore(String nome){
    this.nome=nome;
    }
public String getNomeC(){
    return nome;
}
public String toString(){
    return "Colore: " + this.nome;
    }
}