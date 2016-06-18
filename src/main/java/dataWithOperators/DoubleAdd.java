package dataWithOperators;

import mainLogic.TaskParser;
import operators.Add;

/**
 * Created by Дима on 17.06.2016.
 */
public class DoubleAdd implements Add<Double> {

    Double operand1, operand2;
    TaskParser taskParser = null;

    public DoubleAdd(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Double.valueOf(taskParser.getFirstOperand());

        this.operand2 = Double.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Double add() {
        Double result = operand1 + operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Double call() {
        return add();
    }
}
