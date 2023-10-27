package test;

public class ThapPhanSangBatPhan {
    public static void main(String[] args) {
        int input = 142;
        StringBuilder result = new StringBuilder();
        int soDu;
        for (int i = 0; ; i++) {
            soDu = input % 8;
            input = input / 8;
            result.append(soDu);
            if (input%8==0){
                break;
            }
        }
        System.out.println(result.reverse());
    }
}
