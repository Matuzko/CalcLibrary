import mainLogic.DefaultExecutorImp;
import mainLogic.Executor;
import mainLogic.TaskParser;


public class Calculator {

    private Executor executor;

    public Calculator() {
        this.executor = new DefaultExecutorImp();
    }

    public Calculator(Executor executor) {
        this.executor = executor;
    }

    public String calculate (String taskText){

        TaskParser taskParser = new TaskParser(taskText);
        executor.execute(taskParser);
        return taskParser.getResult();
    }
}
