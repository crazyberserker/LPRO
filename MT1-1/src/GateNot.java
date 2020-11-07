
public class GateNot extends LogicGate {
	public GateNot(LogicVariable output, LogicVariable input1) throws ColisionException {
		this.inputs = new LogicVariable[1];
		output.setValue(!input1.getValue());
		
		if(output.getCalculatedBy() != null)
			throw new ColisionException();
		
		output.setCalculatedBy(this);
		
		this.output = output;
		this.inputs[0] = input1;
	
	}
	
	@Override
	public String getSymbol() {
		return "NOT";
	}
	
	@Override
	public boolean getValue() {
		return (!inputs[0].getValue());
	}
	public String getFormula() {
		return "NOT(" + inputs[0].getFormula() + ")";
	}
}
