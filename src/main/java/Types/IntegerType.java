package Types;

import Operators.Add;
import Operators.Subtraction;
import Types.DataType;

/**
 * Created by Дима on 15.06.2016.
 */
public class IntegerType extends DataType<Integer> implements Add, Subtraction {

    public IntegerType(Integer firstoperand, Integer secondOperand) {
        super(firstoperand, secondOperand);
    }

    public void add() {
        this.setResult(getFirstoperand()+getSecondOperand());
    }

    public void sub() {
        this.setResult(getFirstoperand() - getSecondOperand());
    }
}
