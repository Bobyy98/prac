class SalesTaxCalculator1c {
    float amount; // instance variable
    float taxRate; // instance variable

    // Constructor without arguments
    SalesTaxCalculator1c() {
        this.amount = 100.0f;
        this.taxRate = 10.2f;
    }

    // Overloaded constructor with arguments
    SalesTaxCalculator1c(float amount, float taxRate) {
        this.amount = amount;
        this.taxRate = taxRate;
    }

    void calculateTax() {
        float taxAmt = this.amount * this.taxRate / 100;
        System.out.println("Tax Amount: " + taxAmt);
    }

    void displayInstanceVariables() {
        System.out.println("Amount: " + this.amount);
        System.out.println("Tax Rate: " + this.taxRate);
    }

    public static void main(String args[]) {
        SalesTaxCalculator1c obj1 = new SalesTaxCalculator1c();
        SalesTaxCalculator1c obj2 = new SalesTaxCalculator1c(200.0f, 8.5f);

        System.out.println("Object 1:");
        obj1.displayInstanceVariables();
        obj1.calculateTax();

        System.out.println("Object 2:");
        obj2.displayInstanceVariables();
        obj2.calculateTax();
    }
}
