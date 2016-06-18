package dataWithOperators;

import mainLogic.TaskParser;
import operators.Substraction;

/**
 * Created by Дима on 18.06.2016.
 */
public class LongSubstraction implements Substraction<Long> {

    Long operand1, operand2;
    TaskParser taskParser = null;

    public LongSubstraction(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Long.valueOf(taskParser.getFirstOperand());
        this.operand2 = Long.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Long substraction() {
        Long result = operand1 - operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Long call() {
        return substraction();
    }
}
