
package week7.task1;


 public class Division extends BinaryExpression{
    Expression left, right;
    public void Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public int division(){
        return left.evaluate()/right.evaluate();
    }
}
