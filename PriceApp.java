public class PriceApp {

    public static void main(String args[]){
        int count = 11;
        //the literal 7.12 gets treated as a double BY DEFAULT
        //if you want it to be a float you have to explicitly say so
        // by adding the f to the end here...


        //WHY CAN I DO THIS:
        // because a float is smaller than a double so it can "fit" in a double
        double unitPrice = 7.12f; //this is an error without the f

        //BUT I CAN NOT DO THIS:
        //but a double is bigger than a float, so a double can NOT  "fit" inside
        // a FLOAT
        float unitPrice2 = 7.12f;

        float taxRate = 0.825f;
        float totalCost;

        totalCost = (count * unitPrice) * (1 + taxRate);
        System.out.println(totalCost);
    }
}
