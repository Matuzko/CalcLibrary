package Types;

import Operators.Add;
import Operators.Subtraction;

/**
 * Created by Дима on 15.06.2016.
 */
public abstract class DataType<T> implements Add, Subtraction {
    private T firstoperand;
    private T secondOperand;
    private T result;

    public DataType(T firstoperand, T secondOperand) {
        this.firstoperand = firstoperand;
        this.secondOperand = secondOperand;
    }

    @Override
    public String toString() {
        return result + " ";
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public T getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(T secondOperand) {
        this.secondOperand = secondOperand;
    }

    public T getFirstoperand() {
        return firstoperand;
    }

    public void setFirstoperand(T firstoperand) {
        this.firstoperand = firstoperand;
    }
}
