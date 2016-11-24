package interpreter;

public class DualOrExpression implements DualExpression {

	private DualExpression expr = null;

	public DualOrExpression(DualExpression expr) {
		this.expr = expr;
	}

	@Override
	public boolean interpret(String elem1, String elem2) {
		return this.expr.interpret(elem1,elem2);
	}

}
