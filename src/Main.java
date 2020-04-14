import kotlin.Lazy;

public class Main {

    public static void main(String[] args) {
        Runnable lazyPrime = new  LazyPrimeFactorization(50);
        Runnable optimizedPrime = new  OptimizedPrimeFactorization(50);

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
    }
}
