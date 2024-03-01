package org.example.utils;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.common.Vector;
import org.example.iec61850.datatypes.measurements.SAV;
@Getter
@Setter
public abstract class Filter {
    public abstract void process(SAV instMag, Vector vector);
}
