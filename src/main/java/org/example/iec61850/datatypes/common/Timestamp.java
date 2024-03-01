package org.example.iec61850.datatypes.common;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
@Getter
@Setter
public class Timestamp extends Data {
    private long value;
}
