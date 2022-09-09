package ss4_class_and_object.exercises.exercise_2;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
