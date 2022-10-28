public class Rotated_Binary_Search
{
    public static void main(String[] args) {
        int [] s = {5,6,7,8,1,2,3};
        System.out.println(search(s,1,0,s.length - 1));
    }
    public static int search(int []arr,int target,int s,int e){
        if(s > e){ //if no value is found then print
            return -1;
        }
        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){  //to check if lHS is sorted or not
            if(target >= arr[s] && target <= arr[m]){
                return search(arr,target,s,m-1);
            }
            else {
                return search(arr,target,m+1,e);
            }
        }
        //to check if the RHS side is sorted or not
        if (target >= arr[m] && target <= arr[e]){
            return search(arr,target,m + 1,e);
        }
        return search(arr,target ,s ,m-1);
    }
}
