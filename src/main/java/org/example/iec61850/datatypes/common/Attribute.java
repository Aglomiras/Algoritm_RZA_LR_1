package org.example.iec61850.datatypes.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attribute<T> {
    private T value;

    public Attribute(T value) {
        this.value = value;
    }
}
