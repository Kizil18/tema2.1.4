package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}
