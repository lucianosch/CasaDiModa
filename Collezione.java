class Collezione{
    private final int MAX_CAPI = 10;
    private Capo capi[];
    private int nCapi;
    
    Collezione(){
        capi = new Capo[MAX_CAPI];
        nCapi = 0;
    }
    
    public boolean add(Capo c){
        if (nCapi < MAX_CAPI){
            capi[nCapi] = c;
            nCapi++;
            return true;
        }
        return false;
    }
    
    public String getCapiPerColore(Colore col){
        String retValue = "Capi di colore: " + col.getNomeC() + "\n";
        for (int i=0; i<nCapi; i++){
            if (capi[i].getColore().getNomeC().equals(col.getNomeC()))
                retValue = retValue + capi[i] +";";
        }
        return retValue;
    }
}