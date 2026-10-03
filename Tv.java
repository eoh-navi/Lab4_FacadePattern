public class Tv implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Tv is turned On");
    }
    @Override
    public void turnOff() {
        System.out.println("Tv is turned Off");
    }
}