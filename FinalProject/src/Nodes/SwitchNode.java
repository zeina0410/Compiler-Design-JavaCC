package Nodes;

public class SwitchNode extends TreeNode{

	public Object execute() {
	    int size = children.size();
	    String caseVar = (String) children.get(0).execute();
	    
	    if(AssiNode.variables.containsKey(caseVar) && (AssiNode.variables.get(caseVar) != null)) {
	      Object caseValue = AssiNode.variables.get(caseVar);
	      boolean found = false;
	      int i = 1;
	      
	      while(!found && (i<size-1)) {
	        CaseNode cn= (CaseNode) children.get(i);
	        if( cn.children.get(0).execute() == caseValue ) {
	          children.get(i).execute();
	          found=true;
	        }
	        i++;
	      }
	      
	      if(!found && (i == size-1)) {
	        System.out.println("Hi from calling default ");
	         children.get(size-1).execute();
	      }
	      
	    }
	    else 
	    	System.out.println("Error.");
		return null;
	}

}
