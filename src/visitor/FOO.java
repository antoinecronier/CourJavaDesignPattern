package visitor;

public class FOO implements Element{
	public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFOO() {
        return "FOO";
    }
}
