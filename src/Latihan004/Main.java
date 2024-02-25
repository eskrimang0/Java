package Latihan004;


public class Main {
	
	public static void main(String[] args) {
		ModelData modelData = new ModelData();
		ViewData viewData = new ViewData();
		
		ControllerData controllerData = new ControllerData(modelData, viewData);
		
		String inputData = viewData.getInput();
		controllerData.setData(inputData);
		
		controllerData.updateView();
	}

}
