
public class GateOr extends LogicGate {

	public GateOr(LogicVariable output, LogicVariable x1, LogicVariable x2){
		
		this.inputs = new LogicVariable[2];
		output.setValue(x1.getValue() || x2.getValue());
		
		
		output.setCalculatedBy(this);
		this.output=output;
		this.inputs[0]=x1;
		this.inputs[1]=x2;
		
	}
	

	@Override
	public String getSymbol() {
		return "OR";
	}
	
	public String getFormula() {
		return "AND(" + inputs[0].getFormula() + "," + inputs[1].getFormula() + ")";
	}
}
