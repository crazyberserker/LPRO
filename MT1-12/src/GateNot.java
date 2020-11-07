
public class GateNot extends LogicGate {

	public GateNot(LogicVariable y1, LogicVariable w2)  {
	

		this.inputs = new LogicVariable[1];
		y1.setValue(!w2.getValue());
		
		
		
		this.output=y1;
		this.inputs[0]=w2;
	
		
		
	}

	@Override
	public String getSymbol() {
		return "NOT";
	}

	@Override
	protected String getFormula() {
		return "NOT(" + inputs[0].getFormula() + ")";
	}

}
