package com.behavioral.visitor;

import com.behavioral.visitor.employee.FulltimeEmployee;
import com.behavioral.visitor.employee.ParttimeEmployee;

public interface Visitor {
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
