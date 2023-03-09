package Nodes;

public class WhileNode extends TreeNode{
	
	public Object execute() {
		while((boolean)children.get(0).execute()){
			for(int i=1; i<children.size();i++) {
				children.get(i).execute();
			}
		}
		return null;
	}

}
