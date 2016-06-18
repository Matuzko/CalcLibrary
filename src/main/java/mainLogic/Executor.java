package mainLogic;

import operators.Operator;
import mainLogic.TaskParser;

/**
 * Created by Дима on 17.06.2016.
 */
public interface Executor {

    Operator operatorFinder (TaskParser taskParser);

    void execute (TaskParser taskParser);

}
