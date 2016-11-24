package interpreter;

public class DualTerminalExpression implements DualExpression {
	private String data1;
	private String data2;

	public DualTerminalExpression(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public boolean interpret(String elem1, String elem2) {
		if (elem1.contains(data1) && elem2.contains(data2)) {
			return true;
		}
		return false;
	}
}
