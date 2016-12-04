package depositodati;

/**
 *
 * @author smpiccini & ncvescera
 */
public class Deposito {
    private int[] data;
    private int lastRead;
    
    
    public Deposito(int dim){
        data = new int[dim];
        lastRead = 0;
    }
    
    public void scrivi(int pos, int n){
        data[pos] = n;
    }
    
    public int getSize(){
        return data.length;
    }
    
    synchronized public void leggi(int n){
        int toRead = lastRead;
        lastRead += n;
        System.out.println(Thread.currentThread().getName()+" legge:");
        for(int i = toRead; i < lastRead; i++){
            System.out.println(data[i]);
        }
    }
}
