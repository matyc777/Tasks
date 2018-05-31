import tasks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task1());
        taskList.add(new Task2());
        taskList.add(new Task3());
        taskList.add(new Task4());
        taskList.add(new Task5());
        taskList.add(new Task6());
        taskList.add(new Task7());
        taskList.add(new Task8());
        taskList.add(new Task9());
        taskList.add(new Task10());
        for (Task task:taskList) {
            task.start();
        }
    }
}
