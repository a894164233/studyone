package com.example.studyone.util;

public interface CommonEmun {

    enum Role{
        ADMIN("1"),
        TURIES("2"),
        VIP("3");

        String value;

        Role(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
}
