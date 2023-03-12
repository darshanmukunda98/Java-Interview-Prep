package FlipkartInterview;

public class Courier {
    private String title;
    private String senderName;
    private String receiverName;
    private int sourcePincode;
    private int destinationPincode;
    private CourierType courierType;
    private CourierStatus courierStatus;
    public enum CourierType{
        LETTER(50),
        PARCEL(200),
        LUGGAGE(1000);
        public final int price;
        private CourierType(int price){this.price = price;}
    }
    public enum CourierStatus{
        REQUESTED,
        DELIVERED,
        CANCELED
    }
    private Courier(String title,
                    String senderName,
                    String receiverName,
                    CourierType courierType,
                    int sourcePincode,
                    int destinationPincode){
        this.title = title;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.courierType = courierType;
        this.sourcePincode = sourcePincode;
        this.destinationPincode = destinationPincode;
        this.courierStatus = CourierStatus.REQUESTED;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "title='" + title + '\'' +
                ", senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", sourcePincode=" + sourcePincode +
                ", destinationPincode=" + destinationPincode +
                ", courierType=" + courierType +
                ", courierStatus=" + courierStatus +
                '}';
    }

}
