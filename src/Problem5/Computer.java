package Problem5;

public class Computer {
   private String manufacturer;
   private String processor;
   private int ramSize;
   private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    int getRamSize() {
        return ramSize;
    }
    double getProcessorSpeed(){
        return processorSpeed;
    }
    double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "{manufacturer: "+ manufacturer +
                ", processor: " + processor +
                ", ramSize: " + ramSize +
                ", processorSpeed: "+ processorSpeed +
                "}";
    }
}
