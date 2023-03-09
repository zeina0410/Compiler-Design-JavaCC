package Nodes;

public class BlockNode extends TreeNode{

	public Object execute() {
		for (TreeNode c : children) 
			c.execute();
		return null;
	}
}