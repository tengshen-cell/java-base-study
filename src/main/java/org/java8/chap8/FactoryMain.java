package org.java8.chap8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/10 11:50
 */
public class FactoryMain {
    static private class ProductFactory {
        public static Product createProduct(String name) {
            switch (name) {
                case "loan":
                    return new Loan();
                case "stock":
                    return new Stock();
                case "bond":
                    return new Bond();
                default:
                    throw new RuntimeException("No such product " + name);
            }
        }

        public static Product createProductLambda(String name) {
            Supplier<Product> supplier = map.get(name);
            if (supplier != null) return supplier.get();
            throw new RuntimeException("No such product " + name);
        }

    }

    private interface Product {
    }

    static private class Loan implements Product {
    }

    static private class Stock implements Product {
    }

    static private class Bond implements Product {
    }

    final static private Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }

    public static void main(String[] args) {
        Product loan = ProductFactory.createProduct("loan");

        Supplier<Loan> loanSupplier = Loan::new;
        Product loan1 = loanSupplier.get();

        Product loan2 = ProductFactory.createProductLambda("loan");
    }
}
