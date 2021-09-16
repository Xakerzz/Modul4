import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    public static void main(String[] args) {
        long phoneNumber = 9260125786L;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; phoneNumber <9269999999L ; phoneNumber++) {
            String str = Long.toString(phoneNumber);
            sb.append(str);
        }

        String text = sb.toString();
        Pattern pattern = Pattern.compile("999\\d{5}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }

    }
int j;

}
