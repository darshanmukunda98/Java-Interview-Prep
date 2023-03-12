package FlipkartInterview;

public class Main {
    public static void main(String[] args) {
        CourierDAO courierDAO = new CourierDAO();
        courierDAO.createCourier("title1", "sender1", "receiver1", "Letter", 560103, 560101);

        courierDAO.createCourier("title2", "sender2", "receiver2", "Parcel", 560099, 560102);

        courierDAO.createCourier("title3", "sender3", "receiver3", "Luggage", 560115, 560130);

        //courierDAO.displayAllCouriers();

        courierDAO.updateDeliveryStatus("title1", "DELIVERED");

        //courierDAO.displayAllCouriers();

        courierDAO.updateDeliveryStatus("title2", "CANCELED");

        //courierDAO.displayAllCouriers();

        courierDAO.displayCouriersBySender("sender1");

        courierDAO.displayCouriersByStatus("DELIVERED");

        courierDAO.displayCouriersByType("Luggage");
    }
}
