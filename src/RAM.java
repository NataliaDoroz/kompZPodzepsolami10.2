public class RAM extends TimingComponent {
    int memory;

    public RAM(String modelName, String producent, String id, int timing, double assumedTemperature, double maximumTemerature) {
        super(modelName, producent, id, timing, assumedTemperature, maximumTemerature);
        this.memory = memory;
    }

    @Override
    protected int getNumber() {
        return 15;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "memory=" + memory +
                ", timing=" + timing +
                ", assumedTemperature=" + assumedTemperature +
                ", maximumTemerature=" + maximumTemerature +
                ", modelName='" + modelName + '\'' +
                ", producent='" + producent + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
