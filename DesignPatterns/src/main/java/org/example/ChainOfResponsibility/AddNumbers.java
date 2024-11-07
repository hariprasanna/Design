package org.example.ChainOfResponsibility;

public class AddNumbers implements Chain {
    private Chain nextChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers numbers) {
        if(numbers.getCalculationWanted() == "add") {
            System.out.println(numbers.getNumber1() + " + " + numbers.getNumber2() + " = " + (numbers.getNumber1() + numbers.getNumber2()));
        } else {
            nextChain.calculate(numbers);
        }
    }
}
