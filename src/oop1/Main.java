package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade orani";

        Product product1 = new Product();
                //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("coff.jpg");
                //get value
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("coff2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("coff3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05232323232");
        individualCustomer.setCustomerNumber("57656");
        individualCustomer.setFirstName("Nikita Hasan");
        individualCustomer.setLastName("Kafes");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Nazedus");
        corporateCustomer.setPhone("05478329120");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("26738");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}