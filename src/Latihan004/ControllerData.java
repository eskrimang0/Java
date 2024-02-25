package Latihan004;

public class ControllerData {
    private ModelData modelData;
    private ViewData viewData;
    
    public ControllerData(ModelData modelData, ViewData viewData) {
        this.modelData = modelData;
        this.viewData = viewData;
    }
    
    public void setData(String data) {
        modelData.setData(data);
    }
    
    public void updateView() {
        viewData.displayData(modelData.getData());
    }
}

