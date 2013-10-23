import java.util.ArrayList;
import java.util.HashMap;

/**
 * Method class. This is the same as IntraProcedural Graph
 * @author Faisal
 *
 */

public class Method implements GraphComponent {
	
	private String packageAndClass;
	private String name;
	private ArrayList<String> paramsTypes;
	private String returnType;
	private ArrayList<GraphComponent> basicblocks;
	private HashMap<String, BasicBlock> basicBlockMap;
	
	
	public Method(){
		basicblocks = new ArrayList<GraphComponent>();
		paramsTypes = new ArrayList<String>();
		basicBlockMap = new HashMap<String, BasicBlock>();
	}

	public String getPackageAndClass() {
		return packageAndClass;
	}


	public void setPackageAndClass(String packageAndClass) {
		this.packageAndClass = packageAndClass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<String> getParamsTypes() {
		return paramsTypes;
	}
	
	public void addParamType(String pt){
		paramsTypes.add(pt);
	}


	public String getReturnType() {
		return returnType;
	}


	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	public ArrayList<GraphComponent> getBasicBlocks(){
		return basicblocks;
	}

	@Override
	public void addComponent(GraphComponent e) {
		basicblocks.add(e);
		
		if(e instanceof BasicBlock)
			this.basicBlockMap.put(((BasicBlock) e).getName(), (BasicBlock)e);
	}

	@Override
	public void removeComponent(GraphComponent e) {
		
		basicblocks.remove(e);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}
	
	
}
