package Nodes;

public class ForNode extends TreeNode {

	public Object execute() {
		children.get(0).execute();
		while((boolean)children.get(1).execute()) {
			for(int i=3; i<children.size();i++) {
				children.get(i).execute();
			}
			children.get(2).execute();
		}
		return null;
	}

}
