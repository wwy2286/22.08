import java.util.ArrayList;
public class primeDB {



        private static ArrayList<Long> prime = new ArrayList<>();
        public static ArrayList<Long> getPrimeList(){
            return prime;
        }
        public static void setPrimeList(ArrayList<Long> prime){
            primeDB.prime = prime;
        }



}
