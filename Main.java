public class Main {
    public static void main(String[] args) {
        Modello tshirt = new Modello("T-shirt", 7.50, 4.75);
        Modello camicia = new Modello("Camicia", 6.00, 5.00);
        Colore giallo = new Colore("Giallo");
        Colore rosso = new Colore("Rosso");
        Materiale cotone = new Materiale("Cotone", 15.75);
        Materiale seta = new Materiale("Seta",19.90);
        Capo capo = new Capo(tshirt, rosso, cotone);
        Capo capo1 = new Capo(camicia,giallo,seta);
        Collezione collezione = new Collezione();
        
        collezione.add(capo);
        collezione.add(capo1);

        System.out.println(tshirt);
        System.out.println(giallo);
        System.out.println(rosso);
        
        System.out.println(capo);
        System.out.println("Prezzo: " + capo.prezzo());
        
        System.out.println(capo1);
        System.out.println("Prezzo: " + capo1.prezzo());
        
        System.out.println(collezione.getCapiPerColore(new Colore("Giallo")));
        
    }
}
