import java.io.IOException;
import java.text.ParseException;

public class PackageGenerator {

    public void generator() throws IOException, ParseException {

        IList<Tuna> tunaIList = new ArrayList<>();
        IList<Corn> cornIList = new ArrayList<>();
        IList<Pudding> puddingIList = new ArrayList<>();
        IList<Noodle> noodleIList = new ArrayList<>();
        IList<Order> orderIList = new ArrayList<>();

        IStack<Tuna> tunaIStack = new ArrayStack<>();
        IStack<Corn> cornIStack = new ArrayStack<>();
        IStack<Pudding> puddingIStack = new ArrayStack<>();
        IStack<Noodle> noodleIStack = new ArrayStack<>();

        IQueue<Order> orderIQueue = new ArrayQueue<>();
        IList<Order> cargoPackets = new ArrayList<>();

        IList<TunaCargoPacket> tunaCargoPacketIList = new ArrayList<>();
        IList<CornCargoPacket> cornCargoPacketIList = new ArrayList<>();
        IList<PuddingCargoPacket> puddingCargoPacketIList = new ArrayList<>();
        IList<NoodleCargoPacket> noodleCargoPacketIList = new ArrayList<>();

        FileIO.readFile(orderIList,tunaIList,cornIList,puddingIList,noodleIList);


        System.out.println("Pile of tuna before processing the orders: ");
        FoodStack.tunaStack(tunaIList,tunaIStack);
        tunaIStack.displayItems();
        System.out.println("Pile of tuna after processing the orders: ");
        FoodCargoPackets.tunaCargoPacketList(tunaCargoPacketIList,orderIList,tunaIStack);
        tunaIStack.displayItems();
        System.out.println();
        System.out.println();


        System.out.println("Pile of corn before processing the orders: ");
        FoodStack.cornStack(cornIList,cornIStack);
        cornIStack.displayItems();
        System.out.println("Pile of corn after processing the orders: ");
        FoodCargoPackets.cornCargoPacketList(cornCargoPacketIList,orderIList,cornIStack);
        cornIStack.displayItems();
        System.out.println();
        System.out.println();


        System.out.println("Pile of pudding before processing the orders: ");
        FoodStack.puddingStack(puddingIList,puddingIStack);
        puddingIStack.displayItems();
        System.out.println("Pile of pudding after processing the orders: ");
        FoodCargoPackets.puddingCargoPacketList(puddingCargoPacketIList,orderIList,puddingIStack);
        puddingIStack.displayItems();
        System.out.println();
        System.out.println();


        System.out.println("Pile of noodle before processing the orders: ");
        FoodStack.noodleStack(noodleIList,noodleIStack);
        noodleIStack.displayItems();
        System.out.println("Pile of noodle after processing the orders: ");
        FoodCargoPackets.noodleCargoPacketList(noodleCargoPacketIList,orderIList,noodleIStack);
        noodleIStack.displayItems();
        System.out.println();
        System.out.println();


        System.out.println("The waiting line of orders: ");
        FoodQueue.waitingLine(orderIList,orderIQueue);
        System.out.println();
        System.out.println();


        System.out.println("The list of cargo packets: ");
        CargoPackets.cargoPackets(orderIList,cargoPackets);
        System.out.println();
        System.out.println();



        //Print the expiration dates of the packaged products of the cargo packet with ID 25
        System.out.println("The expiration dates of the packaged products of the cargo packet with ID 25:");
        int id = 25;
        for (int index = 0; index < tunaCargoPacketIList.getLength(); index++) {
            if (tunaCargoPacketIList.getEntry(index).getId() == id){
                System.out.println(tunaCargoPacketIList.getEntry(index).getExpirationDate());
                break;
            }
        }
        for (int index = 0; index < cornCargoPacketIList.getLength(); index++) {
            if (cornCargoPacketIList.getEntry(index).getId() == id){
                System.out.println(cornCargoPacketIList.getEntry(index).getExpirationDate());
                break;
            }
        }
        for (int index = 0; index < puddingCargoPacketIList.getLength(); index++) {
            if (puddingCargoPacketIList.getEntry(index).getId() == id) {
                System.out.println(puddingCargoPacketIList.getEntry(index).getExpirationDate());
                break;
            }
        }
        for (int index = 0; index < noodleCargoPacketIList.getLength(); index++) {
            if (noodleCargoPacketIList.getEntry(index).getId() == id){
                System.out.println(noodleCargoPacketIList.getEntry(index).getExpirationDate());
                break;
            }
        }
        System.out.println();
        System.out.println();


        //Remove the cargo packet with ID 20 from the cargo packets list and print the contents of the list again.
        System.out.println("The contents of the list with removed the cargo packet with ID 20:");
        int removeID = 20;
        cargoPackets.remove(removeID-1);
        for (int index = 0; index < cargoPackets.getLength(); index++){
            System.out.println(cargoPackets.getEntry(index));
        }

    }

}
