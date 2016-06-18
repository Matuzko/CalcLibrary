package dataWithOperators;

import mainLogic.TaskParser;
import operators.Add;


public class LongAdd implements Add<Long> {

    Long operand1, operand2;
    TaskParser taskParser = null;

    public LongAdd(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Long.valueOf(taskParser.getFirstOperand());
        this.operand2 = Long.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Long add() {
        Long result = operand1 + operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Long call() {
        return add();
    }
}
