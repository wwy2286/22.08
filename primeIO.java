import java.io.*;
import java.util.ArrayList;

public class primeIO {

        public static void writePrime(ArrayList<Long> prime) throws IOException {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("PrimeNumbers.dat"));
            output.writeObject(prime);
        }
        public static Object readPrime() throws IOException, ClassNotFoundException{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("PrimeNumbers.dat"));
            return input.readObject();
        }
    }


