public class Optimised_Prime
{
    public static void main(String[] args)
    {
        int n =40;
        boolean [] primes = new boolean[n + 1]; // store value till 40
        sieve(n,primes);
    }
    //time complexity is O( N * log(logN))
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i * i <= n ; i++) { // i * i => check till half of the value
            if(!primes[i]){   //boolean stores flase at the begining of the array // !false = true
                for (int j = i * 2; j <= n ; j+=i) {  //multiplication of the ith value
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i]){ //All the false is going to print
                System.out.print(i + " ");
            }
        }
    }
}
