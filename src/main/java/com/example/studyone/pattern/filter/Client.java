package com.example.studyone.pattern.filter;

class Client {

    private FilterManager filterManager;

    void sendRequest(String request) {
        filterManager.filterRequest(request);
    }

    void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

}
