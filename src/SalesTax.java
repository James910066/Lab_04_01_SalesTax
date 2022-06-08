public class SalesTax
{
    public static void main(String[] args)
    {
        double itemPrice = 2.00;
        double SALES_TAX = .05;
        double totalCost;
        totalCost = itemPrice + (itemPrice * SALES_TAX);
        System.out.println("The total cost for your purchase is $" + totalCost);
    }

}
