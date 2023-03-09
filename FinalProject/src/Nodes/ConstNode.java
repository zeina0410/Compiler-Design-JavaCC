package Nodes;

public class ConstNode extends TreeNode{
	String val;
	public ConstNode(String val) {
		this.val = val;
	}
	
	public Object execute() {
		int value = Integer.parseInt(this.val);
		return value;
	}
}
