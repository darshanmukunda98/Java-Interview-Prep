Courier Service based on Pincode


Design a courier delivery system based on following requirements:

A courier can have following properties:

Title (unique)

Sender Name

Receiver Name

Courier Type

Source Pincode

Destination Pincode

Status

A courier can be of one of these three types:

Letter (standard delivery rate Rs 50)

Parcel (standard delivery rate Rs 200)

Luggage (standard delivery rate Rs 1000)

A courier can be in one of these following status:

REQUESTED

DELIVERED

CANCELED

Your designed solution should have following features:

Create a courier of any type with delivery details.

List all the couriers for a given SenderName.

List all couriers with details

List couriers based on status OR courier Type with details

Change status of courier.


Bonus:

Make sure allowed state change follows below state transitions, while updating status. Possible state transitions would be.

REQUESTED → DELIVERED, REQUESTED → CANCELED.

The examples below are just to understand the functionalities and may not necessarily be used in the same format as input to your driver program.

Sample Test Cases:

	Create Courier: 

createCourier( title ,senderName, receiverName, courierType,

sourcePIN, destinationPIN)

createCourier(“title1”, “sender1”, “receiver1”, “Letter”, 560103, 560101)

createCourier(“title2”, “sender2”, “receiver2”, “Parcel”, 560099, 560102)

createCourier(“title3”, “sender3”, “receiver3”, “Luggage”, 560115, 560130)

	Change status:

		updateDeliveryStatus(title, status)

updateDeliveryStatus(“title1”, “DELIVERED”)

updateDeliveryStatus(“title2”, “CANCELED”)

	Display Tasks:

displayAllCouriers()

displayCouriersBySender(“sender1”)

displayCouriersByStatus(“DELIVERED”)

displayCouriersByType(“Luggage”)

Guidelines:

You are free to use the language of your choice.

Feel free to store all interim/output data in-memory. Use of any external persistent datastore is not required.

Restrict internet usage to looking up syntax or API references

Save your code/project by your name and email it to the email address provided by the interviewer. Your program will be executed on another machine. So, explicitly specify any dependencies in your email.

Expectations:

Make sure that you have working and demonstrable code for all the above requirements.

Feature requirements should be strictly followed. Work on the required functionalities first and then work on bonus requirements.

Use of proper abstraction, modularity and separation of concerns is required.

Code should easily accommodate new requirements with minimal changes.

Proper exception handling and logging is required.

Writing test cases is encouraged.

Code should be modular, readable and unit-testable.

Important Notes:

Avoid writing monolithic code.

Do not use any database store, use in-memory data structure.

Do not create any UI for the application.

Do not create rest apis, use simple driver class to trigger functionalities.

Executing test cases or simple Main function should be sufficient