package com.example.studyone.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void execute(String request) {
        filters.forEach(filter -> filter.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
