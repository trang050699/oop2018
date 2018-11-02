
package week7.task1;


 public class Multiplication extends BinaryExpression{
    Expression left, right;
    public void Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public int multip(){
        return left.evaluate()*right.evaluate();
    }
}
