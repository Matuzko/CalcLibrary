package mainLogic;



public class TaskParser {

    private String firstOperand, secondOperand, type, operator, result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(String firstOperand) {
        this.firstOperand = firstOperand;
    }

    public String getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(String secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public TaskParser(String taskText) {
        String taskTextMassive[] = taskText.split(" ");

        setType(taskTextMassive[0]);
        setFirstOperand(taskTextMassive[1]);
        setOperator(taskTextMassive[2]);
        setSecondOperand(taskTextMassive[3]);

    }
}
