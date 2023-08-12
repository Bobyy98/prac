class SalesTaxCalculator1b {
    float amount; // instance variable
    float taxRate; // instance variable

    // Constructor without arguments
    SalesTaxCalculator1b() {
        amount = 100.0f;
        taxRate = 10.2f;
    }

    // Overloaded constructor with arguments
    SalesTaxCalculator1b(float initialAmount, float initialTaxRate) {
        amount = initialAmount;
        taxRate = initialTaxRate;
    }

    void calculateTax() {
        float taxAmt = amount * taxRate / 100;
        System.out.println(taxAmt);
    }

    public static void main(String args[]) {
        SalesTaxCalculator1b obj1 = new SalesTaxCalculator1b();
        SalesTaxCalculator1b obj2 = new SalesTaxCalculator1b(200.0f, 8.5f);

        System.out.println("Amount in Object 1: " + obj1.amount);
        System.out.println("Tax Rate in Object 1: " + obj1.taxRate);
        System.out.println("Amount in Object 2: " + obj2.amount);
        System.out.println("Tax Rate in Object 2: " + obj2.taxRate);
    }
}
