package com.shivam09;

interface motor
{
    final String capacity="100 litres";
    public abstract void run();
    public abstract void consume();
}
class Washing_machine implements motor
{
    public void run()
    {
        System.out.println("Capacity="+capacity);
        System.out.println("run function called.");
    }
    public void consume()
    {
        System.out.println("consume function called.");
    }
}
