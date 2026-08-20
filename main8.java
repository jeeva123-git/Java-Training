public class Main {
    public static void main(String[] args) {
        
        String a = "Jeevan At @2026#";
        
        
        int uc = 0;
        int lc = 0;
        int nc = 0;
        int sc = 0;

        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (Character.isUpperCase(ch)) {
                uc++;
            } else if (Character.isLowerCase(ch)) {
                lc++;
            } else if (Character.isDigit(ch)) {
                nc++;
            } else {
                sc++;
            }
        }
        System.out.println("Uppercase Letters : " + uc);
        System.out.println("Lowercase Letters : " + lc);
        System.out.println("Numeric Digits    : " + nc);
        System.out.println("Special Characters: " + sc);
    }
}
