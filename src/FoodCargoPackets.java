public class FoodCargoPackets {

    public static void tunaCargoPacketList(IList<TunaCargoPacket> tunaCargoPacketIList,IList<Order> orderIList,
                                           IStack<Tuna> tunaIStack){

        for (int index = 0; index < orderIList.getLength();index++) {
            for (String s : orderIList.getEntry(index).getFoodCategory()){
                if ("tuna".equals(s)) {
                    tunaCargoPacketIList.add(new TunaCargoPacket(orderIList.getEntry(index).getId(),
                            orderIList.getEntry(index).getDate(), tunaIStack.pop().getExpirationDate()));
                }
            }
        }
    }

    public static void cornCargoPacketList(IList<CornCargoPacket> cornCargoPacketIList, IList<Order> orderIList,
                                           IStack<Corn> cornIStack){

        for (int index = 0; index < orderIList.getLength();index++) {
            for (String s : orderIList.getEntry(index).getFoodCategory()){
                if ("corn".equals(s)) {
                    cornCargoPacketIList.add(new CornCargoPacket(orderIList.getEntry(index).getId(),
                            orderIList.getEntry(index).getDate(), cornIStack.pop().getExpirationDate()));
                }
            }
        }
    }

     public static void puddingCargoPacketList(IList<PuddingCargoPacket> puddingCargoPacketIList,
                                               IList<Order> orderIList, IStack<Pudding> puddingIStack){

         for (int index = 0; index < orderIList.getLength();index++) {
             for (String s : orderIList.getEntry(index).getFoodCategory()){
                 if ("pudding".equals(s)) {
                     puddingCargoPacketIList.add(new PuddingCargoPacket(orderIList.getEntry(index).getId(),
                             orderIList.getEntry(index).getDate(), puddingIStack.pop().getExpirationDate()));
                 }
             }
         }
     }
     
     public static void noodleCargoPacketList(IList<NoodleCargoPacket> noodleCargoPacketIList,IList<Order> orderIList,
                                              IStack<Noodle> noodleIStack){

         for (int index = 0; index < orderIList.getLength();index++) {
             for (String s : orderIList.getEntry(index).getFoodCategory()){
                 if ("noodle".equals(s)) {
                     noodleCargoPacketIList.add(new NoodleCargoPacket(orderIList.getEntry(index).getId(),
                             orderIList.getEntry(index).getDate(), noodleIStack.pop().getExpirationDate()));
                 }
             }
         }
     }

}
