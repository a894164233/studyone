package com.example.studyone.pattern.filter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        this.filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        this.filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        this.filterChain.execute(request);
    }
}


