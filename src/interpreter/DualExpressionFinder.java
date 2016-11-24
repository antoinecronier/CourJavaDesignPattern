package interpreter;

import java.util.ArrayList;

public class DualExpressionFinder implements DualExpression {

	private ArrayList<DualExpression> explist = new ArrayList<DualExpression>();

	@Override
	public boolean interpret(String elem1, String elem2) {
		for (DualExpression dualExpression : explist) {
			if (dualExpression.interpret(elem1, elem2) == true) {
				return true;
			}
		}
		return false;
	}

	public DualExpressionFinder add(DualExpression dualExp) {
		explist.add(dualExp);
		return this;
	}
}
