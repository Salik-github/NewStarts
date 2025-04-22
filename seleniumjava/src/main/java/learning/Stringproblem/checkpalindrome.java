package learning.Stringproblem;

public class checkpalindrome {
    public static void main(String[] args) {

        String a = "test";

        String sb = new StringBuffer(a).reverse().toString();

        if (a.equals(sb)) 
            System.out.println("palindorme");
        else
           System.out.println("not");
        

    }
}
// character checking  
