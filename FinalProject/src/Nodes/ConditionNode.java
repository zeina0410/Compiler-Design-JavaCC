package Nodes;

public class ConditionNode extends TreeNode {

	public Boolean execute() {
		int size = children.size();
		boolean b=(boolean) children.get(0).execute();
		if(size==1)
			return b;
		else {
			boolean res=b;
			int i=2;
			
			while(i<=size-1) {
				String op=(String) children.get(i-1).execute();
				boolean bb= (boolean)children.get(i).execute();
				if(op=="&&") 
					res=res&&bb;
				else if(op=="||") 
					res=res||bb;
				i+=2;
			}
			return res;
		}
	}
}