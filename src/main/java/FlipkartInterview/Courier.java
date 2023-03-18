package FlipkartInterview;

public class Courier {
    private String title;
    private String senderName;
    private String receiverName;
    private int sourcePincode;
    private int destinationPincode;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public int getSourcePincode() {
        return sourcePincode;
    }

    public void setSourcePincode(int sourcePincode) {
        this.sourcePincode = sourcePincode;
    }

    public int getDestinationPincode() {
        return destinationPincode;
    }

    public void setDestinationPincode(int destinationPincode) {
        this.destinationPincode = destinationPincode;
    }

    public CourierType getCourierType() {
        return courierType;
    }

    public void setCourierType(CourierType courierType) {
        this.courierType = courierType;
    }

    public CourierStatus getCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(CourierStatus courierStatus) {
        this.courierStatus = courierStatus;
    }

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
    Courier(String title,
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
