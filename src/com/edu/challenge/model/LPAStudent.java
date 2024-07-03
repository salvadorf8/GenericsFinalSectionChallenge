package com.edu.challenge.model;

public class LPAStudent extends Student {
    private double percentCompleted;

    public LPAStudent() {
        percentCompleted = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentCompleted);
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("percentComplete")) {
            return percentCompleted <= Integer.parseInt(value);
        }
        return super.matchFieldValue(fieldName, value);
    }

    public double getPercentCompleted() {
        return percentCompleted;
    }
}
