package Nodes;

public class CaseNode extends TreeNode {

	public Object execute() {
	    for(int i=1;i<children.size();i++)
	    	children.get(i).execute();
		return null;
	}

}
