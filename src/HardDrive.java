public class HardDrive extends Component {
    int capacity;

    public HardDrive(String modelName, String producent, String id, int capacity) {
        super(modelName, producent, id);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                ", modelName='" + modelName + '\'' +
                ", producent='" + producent + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
