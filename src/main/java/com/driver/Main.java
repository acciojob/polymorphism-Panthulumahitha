package com.driver;

class Main {
    // Task 1: Create a Product class
    static class Product {
        // Task 3: Method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main
        Product p = new Product();

        // Calling the first method
        System.out.println("Product of 2 integers: " + p.product(3, 5));

        // Calling the second overloaded method
        System.out.println("Product of 3 integers: " + p.product(2, 3, 4));

        // Calling the third overloaded method
        System.out.println("Product of 2 doubles: " + p.product(2.5, 4.5));
    }
}
