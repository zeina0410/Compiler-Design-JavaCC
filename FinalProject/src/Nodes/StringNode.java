package Nodes;

public class StringNode extends TreeNode {
	String val;
	
	public StringNode (String v) {
		this.val = v;
	}

	public StringNode () { }

	public void setVal(String v) {
		this.val = v;
	}

	public Object execute() {
		return this.val ;
	}
}
