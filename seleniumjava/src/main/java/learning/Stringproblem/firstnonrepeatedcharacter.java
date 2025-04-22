package learning.Stringproblem;

public class firstnonrepeatedcharacter {

    public static void main(String[] args) {
        String a = "asalika";

        char b[] = a.toCharArray();
        boolean is;
        for (int i = 0; i < b.length; i++) {
            is = false;
            for (int j = 0; j < b.length; j++) {
                if (i != j && b[i] == b[j]) {
                    is = true;
                    break;
                }
            }
            if (!is) {
                System.out.println(b[i]);
                return;
            }
        }

    }
}
