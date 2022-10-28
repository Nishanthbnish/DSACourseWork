public class Fibo
{
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fibo(i));
//        }
            //Binary Search
        int [] arr = {2,5,7,55,77,88};
        System.out.println(search(arr,88,0,arr.length - 1));

        //Fibonacchi Formula
        for (int i = 0; i < 11; i++) {
            System.out.println(fibo_Formula(i));
        }

    }
    static int fibo_Formula(int n){
        return  (int)(Math.pow(((1 + Math.sqrt(5)) / 2 ),n) / Math.sqrt(5));
    }

    static int  fibo(int n){
        if(n < 2){ // base Condition
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); //Recurece Relation
    }

    static int search(int [] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m + 1, e);

    }
}
