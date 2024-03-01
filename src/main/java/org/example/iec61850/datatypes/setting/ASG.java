package org.example.iec61850.datatypes.setting;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
import org.example.iec61850.datatypes.common.AnalogValue;

@Getter
@Setter
public class ASG extends Data {
    private AnalogValue setMag = new AnalogValue();
}
