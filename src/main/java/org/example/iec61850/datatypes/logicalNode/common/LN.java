package org.example.iec61850.datatypes.logicalNode.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class LN {

    private String pref;
    private String clazz;
    private int inst;

    public abstract void process();
}
