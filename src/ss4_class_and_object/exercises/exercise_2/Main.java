package ss4_class_and_object.exercises.exercise_2;

public class Main {
    public static void main(String[] args) {
        StopWatch sW1 = new StopWatch();
        sW1.start();
        for (int i = 0; i <1000000000 ; i++) {
            for (int j = 0; j < 566666666; j++) {

            }
        }
        sW1.stop();
        System.out.println(sW1.getElapsedTime()+"millisecond");
    }
}
