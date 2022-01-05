package com.behavioral.visitor;

public interface Employee {
    public void accept(Visitor visitor); // 接受访问
}
