package extra;

public class Bai5 {
    public static void main(String[] args) {
        String s = "123321";
        boolean check = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                check = true;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("doi xung");
        } else {
            System.out.println("ko doi xung");
        }

    }
}

