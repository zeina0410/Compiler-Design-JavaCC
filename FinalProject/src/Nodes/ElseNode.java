package Nodes;

public class ElseNode extends TreeNode {

	public Object execute() {
		for(int i=0;i<children.size();i++) 
			children.get(i).execute();
		return null;
	}

}
