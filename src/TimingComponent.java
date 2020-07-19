public abstract class TimingComponent extends Component {
    int timing;
    double assumedTemperature;
    double maximumTemerature;

    public TimingComponent(String modelName, String producent, String id, int timing, double assumedTemperature, double maximumTemerature) {
        super(modelName, producent, id);
        this.timing = timing;
        this.assumedTemperature = assumedTemperature;
        this.maximumTemerature = maximumTemerature;
    }

    public void increaseTiming(int timing) {
        this.timing += timing;
        increaseTemperatue();

    }
    public void increaseTemperatue() {
        int quantityIncrease = this.timing / getNumber();

        if (quantityIncrease < maximumTemerature) {
            this.assumedTemperature = quantityIncrease;
        } else {
            System.out.println("za wysoka temp, nie mozna podkrecac");
        }

    }

    protected abstract int getNumber();
}
