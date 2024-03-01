package org.example.iec61850.datatypes.measurements;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
import org.example.iec61850.datatypes.common.AnalogValue;
import org.example.iec61850.datatypes.common.Quality;
import org.example.iec61850.datatypes.common.Timestamp;

@Getter @Setter
public class SAV extends Data {
    private AnalogValue instMag = new AnalogValue();
    private Quality q = new Quality();
    private Timestamp t = new Timestamp();
}
