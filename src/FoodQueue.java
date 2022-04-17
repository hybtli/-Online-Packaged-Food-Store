public class FoodQueue {

    public static void waitingLine(IList<Order> orderIList, IQueue<Order> orderIQueue){
        for (int index = 0; index < orderIList.getLength(); index++) {
            orderIQueue.enqueue(orderIList.getEntry(index));
            System.out.print("ID: " + orderIQueue.getFront().getId() + ", Order Date: ");
            System.out.println(orderIQueue.getFront().getDate());
            orderIQueue.dequeue();
        }
    }

}
