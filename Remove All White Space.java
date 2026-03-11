Remove All White Spaces like tab, newline

public class see{
    public static void main(String[] args) {

        String str = "hello world";

        str = str.replaceAll("\\s+", "");

        System.out.println(str);
    }
}
