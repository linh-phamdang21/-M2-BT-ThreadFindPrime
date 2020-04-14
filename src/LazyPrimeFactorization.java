public class LazyPrimeFactorization implements Runnable {
    private int number;

    public LazyPrimeFactorization(int number){
        this.number = number;
    }

    public boolean isPrime(int inputNumber){
        if (inputNumber >= 2){
            for (int i = 2; i < inputNumber; i++){
                if (inputNumber%i == 0){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        System.out.println("Lazy Prime: ");
        for (int i = 0; i < number; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

