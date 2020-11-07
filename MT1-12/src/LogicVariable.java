
public class LogicVariable {

	protected String name;
	protected boolean value;
	protected LogicGate calculatedBy;
	public LogicVariable(String string, boolean b) {
		this.name=string;
		this.value=b;
	}

	public LogicVariable(String string) {
		super();
		this.name=string;
	}

	public String getName() {
		return name;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean b) {
		this.value=b;
	}

	
	public boolean equals(Object o) {
		
		if(o instanceof LogicVariable){
			LogicVariable v= (LogicVariable)o;
			return name == v.getName();
		}
		return false;
	}

	public LogicGate getCalculatedBy() {
		// TODO Auto-generated method stub
		return calculatedBy;
	}
	public void setCalculatedBy(LogicGate value) {
		this.calculatedBy = value;
	}
	
	public String getFormula() {
		if(calculatedBy == null)
			return name;
		return calculatedBy.getFormula();
	}
}
