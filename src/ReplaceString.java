import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReplaceString {
    public static void main(String[] args) {
        System.out.println(replace("This is a test","/"));

    }

    private static String replace(String a, String b) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < a.length(); i++) {
            if(!(Character.isWhitespace(a.charAt(i)))){
                list.add(a.charAt(i));
            }else{
                list.add(b);
            }
        }
    list.toArray();
        StringBuilder sb = new StringBuilder();
        for (Object s : list)
        {
            sb.append(s);
        }

        //String test = Arrays.stream(list.toArray()).map(e->e.toString()).collect(Collectors.joining());
    return sb.toString();
    }


}
