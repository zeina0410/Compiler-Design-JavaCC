package Nodes;

public class DowhileNode extends TreeNode{

	public Object execute() {
		while((boolean)children.get(children.size()-1).execute()){
			for(int i=0; i<children.size()-1;i++) {
				children.get(i).execute();
			}
		}
		return null;
	}

}
