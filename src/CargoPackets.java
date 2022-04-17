public class CargoPackets{

    public static void cargoPackets(IList<Order> orderIList, IList<Order> cargoPackets)  {

        int minIndex = 0;
        while (!orderIList.isEmpty()){
            int min = 30;
            for (int index=0; index<orderIList.getLength(); index++){
                if (orderIList.getEntry(index).getId() < min){
                    min = orderIList.getEntry(index).getId();
                    minIndex = index;
                }
            }
            cargoPackets.add(orderIList.getEntry(minIndex));
            orderIList.remove(minIndex);

        }
        for (int index=0; index<cargoPackets.getLength(); index++){
            System.out.println(cargoPackets.getEntry(index).toString());
        }

    }

}
