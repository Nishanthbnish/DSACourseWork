public class haming_Distance
{
    public static void main(String[] args)
    {
        System.out.println(hammingDistance(1,4));
        System.out.println(findComplement(10));

    }
    //Find compliment of the number
    public static int findComplement(int num) {
        long i=1;
        while(i<=num)
        {
            num = (int) (num ^ i);  //automatic casting num ^= i;
            i<<=1; //1 ,2, 4, 8, 16 , 32 ,64
        }
        return num;

//            2nd solution
            //String s = Integer.toBinaryString(num); // convert integer to binary
            //StringBuilder sb = new StringBuilder();
            //for(int i=0;i<s.length();i++){
            //if(s.charAt(i) == '1')
            //sb.append('0');
            //else
            //sb.append('1');
            //}
            //String s2 = sb.toString();
            //int decimal=Integer.parseInt(s2,2); //convert binary to integer
            //return decimal;
        }

    public static int hammingDistance(int x, int y) {
//        int count = 0;
//        while(x>0 || y>0) {
//            if((x&1)!=(y&1))
//                count++;
//            x = x >> 1;
//            y = y >> 1;
//        }
//        return count;
        int n = x ^ y; //001 + 100 XOR = 101
                int count = 0;
                while (n > 0) {
                    if ((n & 1) == 1)
                        count++;
                    n = n >> 1;
                }
                return count;
    }
}
