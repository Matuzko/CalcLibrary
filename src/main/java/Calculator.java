import mainLogic.DefaultExecutorImp;
import mainLogic.Executor;
import mainLogic.TaskParser;

import java.util.Scanner;


public class Calculator {

    private Scanner scanner = null;
    private Executor executor;

    public Calculator(DefaultExecutorImp defaultExecutorImp) {
        this.executor = defaultExecutorImp;
    }

    public Calculator(Executor executor) {
        this.executor = executor;
    }

    public String calculate (){

        String taskText = taskTextGetter();
        TaskParser taskParser = new TaskParser(taskText);
        executor.execute(taskParser);
        return taskParser.getResult();
    }
    public String taskTextGetter (){
        scanner = new Scanner(System.in);
        String taskText = scanner.nextLine();
        String splittedTaskText [] = taskText.split(" ");

        if(splittedTaskText.length > 4){
            System.out.println("You write invalid text. Write another\n");
            return taskTextGetter();
        }
        return taskText;
    }
}
