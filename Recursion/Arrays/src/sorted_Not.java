import java.util.ArrayList;
//Linear Search Example Using Different Approach using Recursion
public class sorted_Not
{
    public static void main(String[] args) {
        int [] arr ={1,2,4,5,12,9};
        System.out.println(sorted(arr,0));
        System.out.println(find(arr,6,0));
        System.out.println(findvalue(arr,12,0));
        System.out.println(findvalueLast(arr,5, arr.length - 1) );
        //Using Arralist for duplicate array value

//        findAllValue(arr1,4,0);
//        System.out.println(list);
        int [] arr1 ={ 1,3,4,4,5,6,9};
        ArrayList<Integer> list = new ArrayList<>();
        list = findAllValueList(arr1,4,0,list);
        System.out.println(list);
        //this is not a optimised solution
        System.out.println(findAllValueList1(arr1,4,0));

    }
    //to check sorter or not
    static boolean sorted(int [] arr,int index){
        //base condition
        if(arr.length - 1 == index){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }
    //Recursion Linear Search
    static boolean find(int [] arr ,int target, int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == target || find(arr,target,index + 1);
    }
    //Find the index value in the arr
    static int findvalue(int [] arr ,int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findvalue(arr, target, index + 1);
        }
    }
    //Find the value through backwords
    static int findvalueLast(int [] arr ,int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findvalueLast(arr, target, index - 1);
        }
    }

    //This is to find arr=[1,2,3,4,4,5] target value = 4
    //to find duplicate also like 4
    //That print index number where those are presents
//    static ArrayList<Integer> list =new ArrayList<>(); //Global Variable
//    static void findAllValue(int [] arr ,int target, int index){
//        if(index == arr.length-1){
//            return;
//        }
//        if(arr[index] == target){
//            list.add(index);
//        }
//        findAllValue(arr, target, index + 1);
//    }
    //Returning using ArrayList
    static ArrayList<Integer> findAllValueList(int [] arr ,int target, int index,ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllValueList(arr, target, index + 1,list);
    }

    //This is not optimised solution hence don't use it

    static ArrayList<Integer> findAllValueList1(int [] arr ,int target, int index){
        ArrayList<Integer> list = new ArrayList<>(); //Arraylist is going to create every time the function is called.
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
         ArrayList<Integer> ansOfEvery = findAllValueList1(arr, target, index + 1);
        list.addAll(ansOfEvery); //All the arrayList of ansofevery is collectively stored inside the list now.
        return list;
    }
}
