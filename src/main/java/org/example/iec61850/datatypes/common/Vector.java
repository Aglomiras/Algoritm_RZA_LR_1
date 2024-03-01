package org.example.iec61850.datatypes.common;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
@Getter
@Setter
public class Vector extends Data {

    private AnalogValue mag = new AnalogValue();
    private AnalogValue ang = new AnalogValue();

}
