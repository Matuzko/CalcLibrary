package dataWithOperators;

import mainLogic.TaskParser;
import operators.Substraction;

/**
 * Created by Дима on 17.06.2016.
 */
public class IntegerSubstraction implements Substraction<Integer> {
    Integer operand1, operand2;
    TaskParser taskParser = null;

    public IntegerSubstraction(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Integer.valueOf(taskParser.getFirstOperand());
        this.operand2 = Integer.valueOf(taskParser.getFirstOperand());
    }

    @Override
    public Integer substraction() {
        int result = operand1 - operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Integer call() {
        return substraction();
    }

}
