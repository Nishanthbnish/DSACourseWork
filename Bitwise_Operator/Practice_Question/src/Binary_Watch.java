import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary_Watch
{
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new List[]{readBinaryWatch(1)}));
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        if(turnedOn < 0 || turnedOn > 8){
            return result;
        }
        if(turnedOn == 0){
            result.add("0:00");
        }
        else {
            for(int i = 0; i < 12; i++) {
                for(int j = 0; j < 60; j++) {
                    if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i).append(":").append((j <= 9) ? ("0" + j) : ""+ j);
                        result.add(sb.toString());
                    }
                }
            }
        }
        return result;
    }
}
