package Nodes;

public class CondNode extends TreeNode {

	public Boolean execute() {
		Object leftVar = children.get(0).execute();
		String Op = (String)children.get(1).execute();
		Object rightVar = children.get(2).execute();
		
		if (leftVar.toString().startsWith("$") && AssiNode.variables.containsKey(leftVar) && rightVar instanceof Integer) {
			Object varValue= AssiNode.variables.get(leftVar);
			int r= (int) rightVar;
			if(varValue instanceof Integer) {
				int l= (int)varValue;
				if(Op.equals("==")) return l==r;
				else if(Op.equals(">")) return l>r;
				else if(Op.equals("<")) return l<r;
				else if(Op.equals(">=")) return l>=r;
				else if(Op.equals("<=")) return l<=r;
				else if(Op.equals("!=")) return l!=r;
			}
			else 
				System.out.println("Not compatable data type");
		}
		
		else if (leftVar.toString().startsWith("$") && AssiNode.variables.containsKey(leftVar) && rightVar instanceof Boolean) {
			Object varValue= AssiNode.variables.get(leftVar);
			boolean r= (boolean) rightVar;
			if (varValue instanceof Boolean) {
				boolean l= (boolean) varValue;
				if(Op.equals("==")) return l==r;
				else if(Op.equals("!=")) return l!=r;
			}
			else 
				System.out.println("Not compatable data type");
		}
		
		else if (leftVar.toString().startsWith("$") && AssiNode.variables.containsKey(leftVar) && rightVar.toString().startsWith("$") && AssiNode.variables.containsKey(rightVar)) {
			Object lv= AssiNode.variables.get(leftVar);
			Object rv= AssiNode.variables.get(rightVar);
			if(lv instanceof Integer && rv instanceof Integer) {
				int l= (int) leftVar;
				int r= (int) rightVar;
				if(Op.equals("==")) return l==r;
				else if(Op.equals(">")) return l>r;
				else if(Op.equals("<")) return l<r;
				else if(Op.equals(">=")) return l>=r;
				else if(Op.equals("<=")) return l<=r;
				else if(Op.equals("!=")) return l!=r;
			}

			else if (lv instanceof Boolean && rv instanceof Boolean) {
				boolean l= (boolean) leftVar;
				boolean r= (boolean) rightVar;
				if(Op.equals("==")) return l==r;
				else if(Op.equals("!=")) return l!=r;
			}
			else 
				System.out.println("Not compatable data type");
		}
		
		else
			System.out.println("Variable not found");		
		return false;
	}
}