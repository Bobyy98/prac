class SalesTaxCalculator1a {
    float amount; // instance variable
    float taxRate; // instance variable

    // Constructor without arguments
    SalesTaxCalculator1a() {
        amount = 100.0f;
        taxRate = 10.2f;
    }

    void calculateTax() {
        float taxAmt = amount * taxRate / 100;
        System.out.println(taxAmt);
    }

    public static void main(String args[]) {
        SalesTaxCalculator1a obj1 = new SalesTaxCalculator1a();
        SalesTaxCalculator1a obj2 = new SalesTaxCalculator1a();

        System.out.println("Amount in Object 1: " + obj1.amount);
        System.out.println("Tax Rate in Object 1: " + obj1.taxRate);
        System.out.println("Amount in Object 2: " + obj2.amount);
        System.out.println("Tax Rate in Object 2: " + obj2.taxRate);
    }
}
