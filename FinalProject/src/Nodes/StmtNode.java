package Nodes;

public class StmtNode extends TreeNode {

	public Object execute() {
		children.get(0).execute();
		return null;
	}
}
