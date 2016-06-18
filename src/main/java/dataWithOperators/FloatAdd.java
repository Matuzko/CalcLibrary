package dataWithOperators;

import mainLogic.TaskParser;
import operators.Add;

/**
 * Created by Дима on 18.06.2016.
 */
public class FloatAdd implements Add<Float> {

    Float operand1, operand2;
    TaskParser taskParser = null;

    public FloatAdd(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Float.valueOf(taskParser.getFirstOperand());
        this.operand2 = Float.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Float add() {
        Float result = operand1 + operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Float call() {
        return add();
    }
}
