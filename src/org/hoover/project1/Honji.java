package org.hoover.project1;

public class Honji extends CustomerServiceImpl implements Engine {
    @Override
    public void start() {
        System.out.println("Honji engine is beginning...");
    }
}
