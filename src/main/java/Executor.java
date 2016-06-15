import Exceptions.UnknownOperatorException;
import Exceptions.UnknownTypeException;
import Types.*;


public class Executor {
    private TaskParser taskParser;
    private DataType dataType = null;

    public Executor(TaskParser taskParser) {
        this.taskParser = taskParser;
    }

    public void execute() {

        typeSwitcher();
        operatorSwitcher();
        taskParser.setResult(dataType.toString());
    }

    protected void operatorSwitcher() {
        try{
        switch (taskParser.getOperator()) {
            case "+":
                this.dataType.add();
                break;
            case "-":
                this.dataType.sub();
                break;
            default:
                throw new UnknownOperatorException("Your operator is invalid");
        }

        }catch (UnknownOperatorException ex){
            ex.printStackTrace();
        }
    }

    protected void typeSwitcher() {
        try {
            switch (taskParser.getType()) {
                case "i":
                    this.dataType = new IntegerType(Integer.valueOf(taskParser.getFirstOperand()), Integer.valueOf(taskParser.getSecondOperand()));
                    break;
                case "d":
                    this.dataType = new DoubleType(Double.valueOf(taskParser.getFirstOperand()), Double.valueOf(taskParser.getSecondOperand()));
                    break;
                case "f":
                    this.dataType = new FloatType(Float.valueOf(taskParser.getFirstOperand()), Float.valueOf(taskParser.getSecondOperand()));
                    break;
                case "l":
                    this.dataType = new LongType(Long.valueOf(taskParser.getFirstOperand()), Long.valueOf(taskParser.getSecondOperand()));
                    break;
                default:
                    throw new UnknownTypeException("Your type is invalid");
            }
        }catch (UnknownTypeException ex){
            ex.printStackTrace();
        }
    }
}
