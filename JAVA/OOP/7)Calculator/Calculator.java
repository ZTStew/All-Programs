public class Calculator implements java.io.Serializable {
    
    private double num1;
    private double num2;
    private String operator;
    private double results;

    public Calculator(){

    }

    public void setNum1(double val){
        this.num1 = val;
    }
    public void setNum2(double val){
        this.num2 = val;
    }
    public void setOperator(String op){
        this.operator = op;
    }

    public void performOperation(){
        if(this.operator == "+"){
            results = num1 + num2;
        } else if(this.operator == "-"){
            results = num1 - num2;
        } else if(this.operator == "*" || this.operator == "x"){
            results = num1 * num2;
        } else if(this.operator == "/"){
            results = num1 / num2;
        } else {
            results = num1 + num2;
        }
    }

    public double getResults(){
        return results;
    }
} 