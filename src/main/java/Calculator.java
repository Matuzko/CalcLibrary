/**
 * Created by Дима on 15.06.2016.
 */
public class Calculator {
    public static void calculate(String taskText) throws WrongCaseException {
        TaskParser taskParser = new TaskParser(taskText);
        Executor executor = new Executor(taskParser);
        executor.execute();
        System.out.println(taskText + " = " + taskParser.getResult());
    }
}
