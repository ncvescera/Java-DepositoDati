package depositodati;

/**
 *
 * @author smpiccini & ncvescera
 */
public class Produttore extends Thread{
    private Deposito deposito;
    
    public Produttore(Deposito deposito){
        this.deposito=deposito;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < deposito.getSize(); i++){
            deposito.scrivi(i, i);
        }
    }
}
