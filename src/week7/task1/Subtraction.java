
package week7.task1;

 public class Subtraction extends BinaryExpression {
    Expression left, right;
    public void Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public int sub(){
        return left.evaluate()- right.evaluate();
    }
}
