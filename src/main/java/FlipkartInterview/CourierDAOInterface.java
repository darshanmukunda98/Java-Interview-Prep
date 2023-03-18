package FlipkartInterview;

import java.util.ArrayList;
import java.util.List;

public interface CourierDAOInterface {
    public void createCourier(String title,
                              String senderName,
                              String receiverName,
                              String courierType,
                              int sourcePIN,
                              int destinationPIN);
    public void updateDeliveryStatus(String title,
                                     String courierStatus);
    public void displayAllCouriers();
    public void displayCouriersBySender(String senderName);
    public void displayCouriersByStatus(String courierStatus);
    public void displayCouriersByType(String courierType);
}
