package com.example.studyone.test;

public abstract class InterfaceInner {

    public static enum STATUS {
        a(1),b(2);
        int value;
        STATUS(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

