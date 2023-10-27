package test;

public class SoDoiXungDangNon {
    public static void main(String[] args) {
        System.out.println("CÓ "+solution(10001,250)+" số đối xứng");
    }
    public static int solution(int l, int r){
        int c = 0;
        for (int i = l; i <= r; i++) {
            String s = i+"";
            if(s.charAt(0) == s.charAt(s.length()-1)){
                c ++;
            }
        }
        return  c;
    }
//    public static int check1(int n) {
//        String[] arrN = String.valueOf(n).split("");
//
//        int left = 0;
//        int right = arrN.length - 1;
//
//        while (left < right) {
//            int a = Integer.parseInt(arrN[left]);
//            int b = Integer.parseInt(arrN[right]);
//            if (a != b) {
//                return 0;
//            }
//            left++;
//            right--;
//        }
//        return n;
//    }
//    public static boolean check(int num) {
//        String[] arrNum = String.valueOf(num).split("");
//        int [] arrNum1 = new int[arrNum.length];
//        for (int i = 0; i < arrNum.length; i++) {
//            arrNum1[i] = Integer.parseInt( arrNum[i]);
//        }
//        for (int i = 1; i < arrNum.length/2; i++) {
//            if(arrNum1[i] < arrNum1[i-1]){
//                return false;
//            }
//        }
//        return true;
//    }

}



