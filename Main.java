public class Main {
    public static void main(String[] args) {
        Modello modello = new Modello("T-shirt", 7.50, 4.75);
        Colore colore = new Colore("Giallo");
        Colore rosso = new Colore("Rosso");
        Materiale materiale = new Materiale("Cotone", 15.75);
        Materiale seta = new Materiale("Seta",19.90);
        Capo capo = new Capo(modello, colore, materiale);
        Capo capo1 = new Capo(modello,rosso,seta);
        Collezione collezione = new Collezione();
        
        collezione.add(capo);
        collezione.add(capo1);

        System.out.println(modello);
        System.out.println(colore);
        System.out.println(materiale);
        
        System.out.println(capo);
        System.out.println("Prezzo: " + capo.prezzo());
        
        System.out.println(capo1);
        System.out.println("Prezzo: " + capo1.prezzo());
        
        System.out.println(collezione.getCapiPerColore(new Colore("Giallo")));
        
    }
}
