package depositodati;

/**
 *
 * @author smpiccini & ncvescera
 */
public class TestDeposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Deposito deposito = new Deposito(10000+(int)(Math.random()*5000));
        Produttore p = new Produttore(deposito);
        
        p.start();
        p.join();
        
        final int dataPerThread=400;
        Lettore [] lettori= new Lettore[deposito.getSize()/dataPerThread];
        
        for(int i = 0; i < lettori.length; i++){
            lettori[i] = new Lettore(deposito, dataPerThread);
            lettori[i].start();
        }
    }
    
}
