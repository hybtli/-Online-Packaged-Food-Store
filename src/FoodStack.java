public class FoodStack {

    public static void tunaStack(IList<Tuna> tunaIList, IStack<Tuna> tunaIStack) {
        for (int index = tunaIList.getLength()-1; index>=0; index--){
            tunaIStack.push(tunaIList.getEntry(index));
        }
    }


    public static void cornStack(IList<Corn> cornIList, IStack<Corn> cornIStack) {
        for (int index = cornIList.getLength()-1; index>=0; index--){
            cornIStack.push(cornIList.getEntry(index));
        }
    }

    public static void puddingStack(IList<Pudding> puddingIList, IStack<Pudding> puddingIStack){
        for (int index = puddingIList.getLength()-1; index>=0; index--) {
            puddingIStack.push(puddingIList.getEntry(index));
        }
    }

   public static void noodleStack(IList<Noodle> noodleIList, IStack<Noodle> noodleIStack){
       for (int index = noodleIList.getLength()-1; index>=0; index--) {
           noodleIStack.push(noodleIList.getEntry(index));
       }
   }

}
