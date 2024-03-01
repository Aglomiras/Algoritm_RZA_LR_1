package org.example.iec61850.datatypes.common;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;

@Getter
@Setter
public class AnalogValue extends Data {
    private Atribute<Double> f = new Atribute<>(0.0);

}
