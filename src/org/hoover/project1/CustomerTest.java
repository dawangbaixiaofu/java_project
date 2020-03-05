package org.hoover.project1;

public class CustomerTest {
    public static void main(String[] args){
        CustomerService a = new CustomerServiceImpl();
        a.logout();
        CustomerService b = new CustomerServiceImpl2();
        b.logout();
    }
}
