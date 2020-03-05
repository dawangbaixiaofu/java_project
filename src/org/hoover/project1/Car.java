package org.hoover.project1;

public class Car  {
    Engine e;
    Car(Engine e){
        this.e = e;
    }
    public void testEngine(){
        e.start();
    }
}
