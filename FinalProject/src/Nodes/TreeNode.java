package Nodes;
import java.util.ArrayList;

public abstract class TreeNode {
	public ArrayList<TreeNode> children =new ArrayList<TreeNode>();
	
	public void addChild(TreeNode value) {
		children.add(value);
	}
	
	public abstract Object execute();
}
