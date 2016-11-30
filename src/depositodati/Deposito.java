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
        
        for(int i = 0; i < data.length; i++){
            data[i] = i;
            
        }
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
        for(int i = toRead; i < toRead+n; i++){
            System.out.println(data[i]);
        }
    }
}
