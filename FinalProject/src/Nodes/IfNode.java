package Nodes;

public class IfNode extends TreeNode {

	public Object execute() {
		boolean found = false;
		int n=0;
		
		if(!(boolean)children.get(0).execute()) {
			System.out.println("if wrong");
			for(int i=1;i<children.size();i++) {
				if(!(children.get(i) instanceof ElseifNode) && !(children.get(i) instanceof ElseNode)) {
					n=i;
				}
			}
			found = false;
		}
		
		else if((boolean)children.get(0).execute()) {
			System.out.println("if");
			for(int i=1;i<children.size();i++) {
				if(!(children.get(i) instanceof ElseifNode) && !(children.get(i) instanceof ElseNode)) {
					children.get(i).execute();
				}
			}
			found = true;
			return null;
		}
		
		else if(!found &&(children.get(n+1) instanceof ElseifNode)) {
			System.out.println("elseif");
			int i=n+1;
			while(children.get(i) instanceof ElseifNode) {
				ElseifNode ein= (ElseifNode) children.get(i);
				if((boolean)ein.children.get(0).execute()) {
					ein.execute();
					found=true;
					return null;
				}
			}
		}
		
		else if(!found &&(children.get(children.size()-1) instanceof ElseNode)) {
			System.out.println("else");
			children.get(children.size()-1).execute();
			return null;
		}
		
		return null;
	}

}
