package Nodes;
import java.util.HashMap;


public class AssiNode extends TreeNode{
	static HashMap<String, Object> variables = new HashMap<String, Object>();

	public Object execute() {
		String varName = (String) children.get(0).execute();
		
		if(children.size()==2) {
			Object varValue = children.get(1).execute();
			if((varValue.toString().startsWith("$")) && (varValue instanceof String)) {
		        if(AssiNode.variables.containsKey(varValue)) {
		        	if(AssiNode.variables.get((String)varValue)!=null) {
		        		Object value2 = AssiNode.variables.get(varValue);
		        		variables.put(varName, value2);
		        		System.out.println("Value assigned form another var");
		        	}
		        	else System.out.println("var not intialized");
		        }
		        else if(!AssiNode.variables.containsKey(varValue)) {
		        	System.out.println("var not found");
		        }
			}
	        else if ((varValue instanceof Boolean) || (varValue instanceof Integer) || (varValue instanceof String)){
	        	variables.put(varName, varValue);
	        	System.out.println("Value assigned");
	        }
		}
		else {
			variables.put(varName, null);
			System.out.println("var declared");
		}
		return null;
	}
	
}
