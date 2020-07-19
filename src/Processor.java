public class Processor extends TimingComponent {
    public Processor(String modelName, String producent, String id, int timing, double assumedTemperature, double maximumTemerature) {
        super(modelName, producent, id, timing, assumedTemperature, maximumTemerature);
    }

    @Override
    protected int getNumber() {
        return 10;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "timing=" + timing +
                ", assumedTemperature=" + assumedTemperature +
                ", maximumTemerature=" + maximumTemerature +
                ", modelName='" + modelName + '\'' +
                ", producent='" + producent + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
