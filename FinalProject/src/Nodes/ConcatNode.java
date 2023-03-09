package Nodes;

public class ConcatNode extends TreeNode {

	public String execute() {
		String value2="";
		for (int i=0; i<children.size();i++) {
			Object st = children.get(i).execute();
			if((st instanceof String) && (st.toString().startsWith("$"))) {
				if(AssiNode.variables.containsKey(st)) {
		        	if(AssiNode.variables.get(st)!=null) {
		        		if(AssiNode.variables.get(st) instanceof String) {
							value2 = value2 + (String) AssiNode.variables.get(st);
						}
		        		else if(AssiNode.variables.get(st) instanceof Integer) {
							value2 = value2 + (String) AssiNode.variables.get(st).toString();
						}
		        		else if(AssiNode.variables.get(st) instanceof Boolean) {
							value2 = value2 + (String) AssiNode.variables.get(st).toString();
						}
						else {
							System.out.println("Wrong datatype");
							return null;
						}
		        	}
		        	else {
		        		System.out.println("var not intialized");
		        		return null;
		        	}
		        }
				else if(!AssiNode.variables.containsKey(st)) {
					System.out.println("var not found");
					return null;
				}
	        }
			else if(st instanceof String) {
				value2 = value2 + (String) st;
			}
			else if(st instanceof Integer) {
				value2 = value2 + (String) st.toString();
			}
		}
		return value2;
	}

}
