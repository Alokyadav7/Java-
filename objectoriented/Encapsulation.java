package objectoriented;

public class Encapsulation {
    public static void main(String[] args) {

    }
}
class tv {
    private int screenSize;
    private int id;
    private String name;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPixelCount() {
        return pixelCount;
    }

    public void setPixelCount(int pixelCount) {
        this.pixelCount = pixelCount;
    }

    public String getProcessorName() {

        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private float cost;

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    private String processorName;

    private int pixelCount;
}