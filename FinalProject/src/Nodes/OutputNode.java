package Nodes;

public class OutputNode extends TreeNode {

	public Object execute() {
		Object st1 = children.get(0).execute();
		String con = (String) children.get(1).execute();
		
		String value2="";
		if((st1 instanceof String) && (st1.toString().startsWith("$"))) {
			if(AssiNode.variables.containsKey(st1)) {
	        	if(AssiNode.variables.get((String)st1)!=null) {
	        		if(AssiNode.variables.get(st1) instanceof String) {
						value2 = value2 + (String) AssiNode.variables.get(st1);
					}
	        		else if(AssiNode.variables.get(st1) instanceof Integer) {
						value2 = value2 + (String) AssiNode.variables.get(st1).toString();
					}
	        		else if(AssiNode.variables.get(st1) instanceof Boolean) {
						value2 = value2 + (String) AssiNode.variables.get(st1).toString();
					}
					else {
						System.out.println("Wrong datatype2");
						return null;
					}
	        	}
	        	else {
	        		System.out.println("var not intialized");
	        		return null;
	        	}
			}
	        else if(!AssiNode.variables.containsKey(st1)) {
	        	System.out.println("var not found");
	        	return null;
	        }
		}
		else if(st1 instanceof String) {
			value2 = value2 + (String) st1;
		}
		else if(st1 instanceof Integer) {
			value2 = value2 + (String) st1.toString();
		}
		
		System.out.println(value2 + con);
		return null;
	}

}
