package dataWithOperators;

import mainLogic.TaskParser;
import operators.Add;




public class IntegerAdd implements Add<Integer> {

    Integer operand1, operand2;
    TaskParser taskParser = null;

    public IntegerAdd(TaskParser taskParser) {
        this.taskParser = taskParser;
        this.operand1 = Integer.valueOf(taskParser.getFirstOperand());
        this.operand2 = Integer.valueOf(taskParser.getSecondOperand());

    }

    @Override
    public Integer add() {
        Integer result = operand1 + operand2;
        taskParser.setResult(String.valueOf(result));
        return result;
    }

    @Override
    public Integer call() {
        return add();
    }
}
