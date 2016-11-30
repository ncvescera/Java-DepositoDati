package depositodati;

/**
 *
 * @author smpiccini & ncvescera
 */
public class Lettore extends Thread{
    private Deposito deposito;
    private final int toRead;
    
    public Lettore(Deposito deposito, int toRead){
        this.deposito=deposito;
        this.toRead=toRead;
    }
    
    @Override
    public void run(){
        deposito.leggi(toRead);
    }
}
