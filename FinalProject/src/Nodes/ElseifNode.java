package Nodes;

public class ElseifNode extends TreeNode {

	public Object execute() {
		for(int i=1;i<children.size();i++) 
			children.get(i).execute();
		return null;
	}

}
