package OOPs.Generics.WhatIsGenerics;

public class UseGeneric implements GenericInterface<Integer>{
    @Override
    public void display(Integer value) {
        System.out.println(value);
    }
}
