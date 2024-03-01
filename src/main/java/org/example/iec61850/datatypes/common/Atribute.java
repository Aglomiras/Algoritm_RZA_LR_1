package org.example.iec61850.datatypes.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atribute<T> {
    private T value;

    public Atribute(T value) {
        this.value = value;
    }
}
