//package com.example.studyone.TestColloection;
//
//public enum Color {
//    RED("红色", 1), BLUE("蓝色", 2);
//    private String name;
//    private int index;
//
//    Color(String name, int index) {
//        this.name = name;
//        this.index = index;
//    }
//
//    public static String getName(int index) {
//        for (Color c : Color.values()) {
//            if(c.getIndex() == index) {
//                return c.name;
//            }
//        }
//        return null;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
//
//    @Override
//    public String toString() {
//        return "Color{" +
//                "name='" + name + '\'' +
//                ", index=" + index +
//                '}';
//    }
//}
