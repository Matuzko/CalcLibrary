package Types;

import Operators.Add;
import Operators.Subtraction;
import Types.DataType;

/**
 * Created by Дима on 15.06.2016.
 */
public class DoubleType extends DataType<Double> implements Add, Subtraction {

    public DoubleType(Double firstoperand, Double secondOperand) {
        super(firstoperand, secondOperand);
    }

    public void add() {
        this.setResult(getFirstoperand() + getSecondOperand());
    }

    public void sub() {
        this.setResult(getFirstoperand() - getSecondOperand());
    }
}
