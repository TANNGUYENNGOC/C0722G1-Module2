package test;

public class CheckName {
    public static void main(String[] args) {
        System.out.println(checkRuleName("HelloWorld", "class")); // true
        System.out.println(checkRuleName("HelloWorld", "CLASS")); // true
        System.out.println(checkRuleName("HelloWorld", "cLAss")); // true
        System.out.println(checkRuleName("helloWorld", "cLAss"));
    }
    public static boolean checkRuleName(String name, String rule) {
        switch (rule.toLowerCase()) {
            case "package":
                return checkPackage(name);
            case "class":
                return name.matches("^[A-Z][a-zA-Z0-9]*$");
            case "field":
            case "method":
                return name.matches("^[a-zA-Z][a-zA-Z0-9]*$");
            default:
                return false;
        }
    }
    public static boolean checkPackage(String name) {
        return name.matches("^[a-z][a-z0-9_]*$");
    }
}
