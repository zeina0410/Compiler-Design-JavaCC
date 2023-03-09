package Nodes;

public class IDNode extends TreeNode {

	public Object execute() {
		String varName = (String) children.get(0).execute();
		if(AssiNode.variables.containsKey(varName)) {
			String id = (String) children.get(1).execute();
			Object val = AssiNode.variables.get(varName);
			if(val instanceof Integer) {
				int va = (int) val;
				if(id=="++")
					va++;
				else if(id=="--")
					va--;
				AssiNode.variables.put(varName, va);
			}
			else System.out.println("Value not integer");
		}
		else System.out.println("Variable not declared");
		return null;
	}

}
