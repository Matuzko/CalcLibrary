import mainLogic.Executor;
import mainLogic.TaskParser;


public class Calculator {

    public static void calculate (String taskText, Executor executor){
        TaskParser taskParser = new TaskParser(taskText);
        executor.execute(taskParser);
        System.out.println(taskText + " = " + taskParser.getResult());
    }
}
