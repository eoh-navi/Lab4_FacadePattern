public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning is turned On.");
    }
    @Override
    public void turnOff() {
        System.out.println("Air Conditioning is turned Off.");
    }
}