import java.util.Arrays;

public class Performance
{
    public static void main(String[] args) {
        //this is not a good solution because of O(N^2)
        //In each time the String gets printed by using new creating new Object
        //By using String Builder : only one Object is going to create
        StringBuilder builder = new StringBuilder();
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); //prints all the alphabets
            //System.out.print(ch);
            series = series + ch; //concatinate all the alphabet letters
            //String Bulider
            builder.append(ch);
        }
        System.out.println(series); //Slower Performance
        System.out.println(builder); //Faster Performance
        System.out.println(builder.reverse());
        System.out.println(series.charAt(25)); //by using index value we can find in string
        String str = "Nishath (bangera) Sanil";
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.substring(0,5));
        System.out.println(str.replace("()" ,"o"));
        System.out.println(str.concat(str));
//        System.out.println(Arrays.toString(str.split("")));
//        System.out.println("      Nishanth        bangera".strip()); //Remove white spaces
//        System.out.println(str.indexOf('N'));
//        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
