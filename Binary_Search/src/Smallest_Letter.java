//744. Find Smallest Letter Greater Than Target
public class Smallest_Letter
{
    public static void main(String[] args)
    {
        char [] letters ={'c','f','j'};
        char c= nextGreatestLetter(letters,'d');
        System.out.println(c);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end= letters.length-1;
        boolean asc = letters[start] < letters[end];

        while(start <= end){
            int mid = start + (end - start)/2;

//            if(target == letters[mid]){
//                return mid;
//            }
            if(asc){
                if (target < letters[mid]) {
                    end = mid -1;
                } else  {
                    start = mid + 1;
                }
            }
            //Descending order array
            else {
                if (target > letters[mid]) {
                    end = mid -1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return letters[start % letters.length];//returning mid value with modulus operator
    }
}
