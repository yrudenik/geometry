package com.epam.training.comparators;

import com.epam.training.TriangleObservable;
import com.epam.training.logic.Calculator;

import java.util.Comparator;

public class AreaComparator implements Comparator<TriangleObservable> {

    public final Calculator calculator = new Calculator();

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
        if (calculator.calculateArea(o1) == calculator.calculateArea(o2)) {
            return 0;
        }
        if (calculator.calculateArea(o1) > calculator.calculateArea(o2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
