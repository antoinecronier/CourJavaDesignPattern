package interpreter;

public class InterpreterPatternDemo {

	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Rule: Julie is a married women
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	// Rule: Julie is a married women
	public static DualExpressionFinder getMyTransitionExpression() {
		DualExpression transition1 = new DualTerminalExpression("page1","page2");
		DualExpression transition2 = new DualTerminalExpression("page2","page3");
		DualExpression transition3 = new DualTerminalExpression("page2","page4");
		DualExpressionFinder finder = new DualExpressionFinder()
			.add(transition1)
			.add(transition2)
			.add(transition3);
		return finder;
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		DualExpressionFinder isTransitionnable = getMyTransitionExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interpret("Married Julie"));

		System.out.println("can go to page? " + isTransitionnable.interpret("page2","page3"));
		System.out.println("can go to page? " + isTransitionnable.interpret("page1","page3"));
		System.out.println("can go to page? " + isTransitionnable.interpret("page1","page5"));
	}
}
