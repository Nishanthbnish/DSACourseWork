public class Altitude
{
    public static void main(String[] args)
    {
        int [] gain={-4,-3,-2,-1,4,3,2};
        int s=largestAltitude(gain);
        System.out.println(s);

    }
//    public static int largestAltitude(int[] gain)
//    {
//        int[] alt= new int [101];
//        int temp=0;
//        for(int i=0;i<gain.length;i++)
//        {
//            if(i==0)
//                alt[i]=0;
//                alt[i+1]=gain[i];
//
//            if(i==1)
//                alt[i+1] = gain[i-1]+ gain[i];
//            if(i>=2)
//                alt[i+1] = alt[i] + gain[i];
//
//        }
//        for(int i=0;i<gain.length;i++)
//        {
//            if(alt[i]>=0)
//                temp=alt[i];
//        }
//        return temp;
//    }
        public static int largestAltitude(int[] gain) {
            int[] altitude = new int[gain.length];
            int element = 0;
            for(int i = 0; i<gain.length;i++){
                element = element + gain[i];
                altitude[i] = element;
            }
            int max = 0;
            for(int i = 0; i<altitude.length;i++){
                if(altitude[i]>max){
                    max = altitude[i];
                }
            }
            return max;
        }
}
