package FlipkartInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourierDAO implements CourierDAOInterface {
List<Courier> courierList = new ArrayList<>();

    @Override
    public void createCourier(String title, String senderName, String receiverName, String courierType, int sourcePIN, int destinationPIN) {
        courierList.add(new Courier(title, senderName, receiverName, Courier.CourierType.valueOf(courierType.toUpperCase()), sourcePIN, destinationPIN));
    }

    @Override
    public void updateDeliveryStatus(String title, String courierStatus) {
        courierList
            .stream()
            .filter(courier -> courier.getTitle().equals(title))
            .findAny().get().setCourierStatus(Courier.CourierStatus.valueOf(courierStatus.toUpperCase()));
    }

    @Override
    public void displayAllCouriers() {
        courierList.forEach(System.out::println);
    }

    @Override
    public void displayCouriersBySender(String senderName) {
        courierList
                .stream()
                .filter(courier -> courier.getSenderName().equals(senderName))
                .toList()
                .forEach(System.out::println);
    }

    @Override
    public void displayCouriersByStatus(String courierStatus) {
        courierList
                .stream()
                .filter(courier -> courier
                        .getCourierStatus()
                        .toString()
                        .equals(courierStatus.toUpperCase()))
                .forEach(System.out::println);
    }

    @Override
    public void displayCouriersByType(String courierType) {
        courierList
                .stream()
                .filter(courier -> courier
                        .getCourierType()
                        .toString()
                        .equals(courierType.toUpperCase()))
                .forEach(System.out::println);
    }
}
