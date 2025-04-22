package learning.Stringproblem;

public class reverseString {
    public static void main(String[] args) {
        String a ="Salik";

        char b[] = a.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i = b.length-1;i>=0;i--)
        {
            sb.append(b[i]);
        }
        System.out.println(sb.toString());
    }
}
