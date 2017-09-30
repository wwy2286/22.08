import java.io.IOException;
import java.util.ArrayList;

public class primeMain {
    public static void main(String[]args) {
        int count = 0;
        long start;
//

        loadPrime();
        for (Long list: primeDB.getPrimeList()){
            count++;
        }
        System.out.println(primeDB.getPrimeList());
        System.out.println("The count of prime numbers is " + count);
        if (primeDB.getPrimeList().isEmpty()) {
            start = 2;
            count++;
        }
        else {
            start = primeDB.getPrimeList().get(primeDB.getPrimeList().size() - 1);
        }
        for (long i = start; i<=10000L; i++){
            if (isPrime(i,primeDB.getPrimeList())){
                primeDB.getPrimeList().add(i);
                count ++;
                try {
                    primeIO.writePrime(primeDB.getPrimeList());
                } catch (IOException e){
                    System.err.println("Cannot write primeDB to binary file.");
                    e.printStackTrace();
                }
            }
        }
        System.out.println(primeDB.getPrimeList());
        System.out.println("The count of prime numbers is " + count);




    }

        public static void loadPrime() {
            try {
                primeDB.setPrimeList((ArrayList<Long>) primeIO.readPrime());
            } catch (IOException e) {
                System.err.print("Fail to open/read PrimeNumbers.dat file.");
            } catch (ClassNotFoundException e) {

            }

        }






    public static boolean isPrime(long n, ArrayList<Long> dbList) {
        boolean prime = true;
        if (!(dbList.isEmpty()&&(int)n==2)) {
            for (Long primeNumber : dbList) {
                if (n % primeNumber == 0) {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }
}
