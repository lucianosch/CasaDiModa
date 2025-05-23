public class Main {
    public static void main(String[] args) {
        Modello tshirt = new Modello("T-shirt", 7.50, 4.75);
        Modello camicia = new Modello("Camicia", 6.00, 5.00);
        Modello polo = new Modello("Polo",8.00,5.00);
        Colore giallo = new Colore("Giallo");
        Colore rosso = new Colore("Rosso");
        Materiale cotone = new Materiale("Cotone", 15.75);
        Materiale seta = new Materiale("Seta",19.90);
        Capo capo = new Capo(tshirt, rosso, cotone);
        Capo capo1 = new Capo(camicia,giallo,seta);
        Capo capo2 = new Capo(polo, giallo, cotone);
        Capo capo3 = new Capo(polo, rosso, cotone);
        Capo capo4 = new Capo(camicia,rosso,cotone);
        Capo capo5 = new Capo(tshirt, giallo, cotone);
        Collezione collezione = new Collezione();
               
        collezione.add(capo);
        collezione.add(capo1);
        collezione.add(capo2);
        collezione.add(capo3);
        collezione.add(capo4);
        collezione.add(capo5);
        
        System.out.println(tshirt);
        System.out.println(giallo);
        System.out.println(rosso);
        
        System.out.print(capo);
        System.out.println("Prezzo: " + capo.prezzo());
        
        System.out.print(capo1);
        System.out.println("Prezzo: " + capo1.prezzo());
        
        System.out.print(capo2);
        System.out.println("Prezzo: " + capo2.prezzo());
        
        System.out.println(collezione.getCapiPerColore(new Colore("Giallo")));
        System.out.println(collezione.getCapiPerColore(new Colore("Rosso")));
    }
}
