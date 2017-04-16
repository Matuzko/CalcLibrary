package mainLogic;

import dataWithOperators.*;
import operators.Operator;


public class DefaultExecutorImp implements Executor {

    Operator operator = null;

    @Override
    public Operator operatorFinder(TaskParser taskParser) {

        if (taskParser.getOperator().equals("+")) {
            switch (taskParser.getType()) {
                case "i":
                    return new IntegerAdd(taskParser);
                case "l":
                    return new LongAdd(taskParser);
                case "d":
                    return new DoubleAdd(taskParser);
                case "f":
                    return new FloatAdd(taskParser);
            }
        }
        if (taskParser.getOperator().equals("-")) {
            switch (taskParser.getType()) {
                case "i":
                    return new IntegerSubstraction(taskParser);
                case "l":
                    return new LongSubstraction(taskParser);
                case "d":
                    return new DoubleSubstraction(taskParser);
                case "f":
                    return new FloatSubstraction(taskParser);
            }
        }
        return null;
    }

    @Override
    public void execute(TaskParser taskParser) {
        operator = operatorFinder(taskParser);
        operator.call();

    }
}
