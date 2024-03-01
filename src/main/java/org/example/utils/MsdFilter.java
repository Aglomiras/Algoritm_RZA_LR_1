package org.example.utils;

import lombok.Data;
import org.example.iec61850.datatypes.common.Vector;
import org.example.iec61850.datatypes.measurements.SAV;

@Data
public class MsdFilter extends Filter {

    private final double[] buffer;
    private int count = 0;
    private double sum = 0.0;
    private double k = 1.0;

    public MsdFilter(int bufSize) {
        this.buffer = new double[bufSize];
        this.k = 1.0 / bufSize;
    }

    @Override
    public void process(SAV instMag, Vector vector) {
        double instValueMod = Math.abs(instMag.getInstMag().getF().getValue());
        this.sum = this.sum + instValueMod - buffer[count];


    }
}
