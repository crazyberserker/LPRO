
public abstract class LogicGate {

	protected LogicVariable output;
	protected LogicVariable[] inputs;
	protected String symbol;

	public LogicVariable[] getInputs() {
		return inputs.clone();
	}
	public LogicVariable getOutput() {
		return output;
	}
	public String getSymbol(){
			return symbol;
	}
	protected abstract String getFormula();

}
