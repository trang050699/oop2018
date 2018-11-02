
package week7.task1;


 public class Addition extends BinaryExpression {
    Expression left, right;
    public void Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public int add(){
        return left.evaluate()+ right.evaluate();
    }
}
