package dataWithOperators;

import mainLogic.TaskParser;
import operators.Substraction;

/**
 * Created by Дима on 18.06.2016.
 */
public class FloatSubstraction implements Substraction<Float> {

    Float operand1, operand2;
    TaskParser taskParser = null;

    public FloatSubstraction(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Float.valueOf(taskParser.getFirstOperand());
        this.operand2 = Float.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Float substraction() {
        Float result = operand1 - operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Float call() {
        return substraction();
    }
}
