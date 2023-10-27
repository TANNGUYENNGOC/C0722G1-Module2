package test;

public class NoiChuoi {
    public static void main(String[] args) {
////C1:
//        String str1 = "Hello";
//        String str2 = "World";
//        String result = str1 + " " + str2;
//        System.out.println(result);
////        C2:
//        String str3 = "Hello";
//        String str4 = "World";
//        String result1 = str3.concat(" ").concat(str4);
//        System.out.println(result1);
//
////        c3:
//        String str5 = "Hello";
//        String str6 = "World";
//        StringBuilder sb = new StringBuilder();
//        sb.append(str5).append(" ").append(str6);
//        String result2 = sb.toString();
//        System.out.println(result2);
//
//        //C4
//        String str7 = "Hello";
//        String str8 = "World";
//        StringBuffer sb1 = new StringBuffer();
//        sb.append(str7).append(" ").append(str8);
//        String result3 = sb.toString();
//        System.out.println(result3);

//        String ta = "A ";
//        ta = ta.concat("B ");
//        String tb = "C ";
//        ta = ta.concat(tb);
//        ta = ta.replace('C', 'D');
//        ta = ta.concat(tb);
//        System.out.println(ta);

//        StringBuilder sb = new StringBuilder(5);
//        StringBuilder s = new StringBuilder(5);
//        if (sb.equals(s)) {
//            System.out.println("Match 1");
//        } else if (sb.toString().equals(s.toString())) {
//            System.out.println("Match 2");
//        } else {
//            System.out.println("No Match");
//        }

        String a = new String( "a");
        String b = new String("a");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
