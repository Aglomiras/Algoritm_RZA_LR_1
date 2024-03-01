package org.example.iec61850.datatypes.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
import org.example.iec61850.datatypes.common.Atribute;

@Getter
@Setter
public class ACT extends Data {
    private Atribute<Boolean> genreal = new Atribute<>(false);
    private Atribute<Boolean> phsA = new Atribute<>(false);
    private Atribute<Boolean> phsB = new Atribute<>(false);
    private Atribute<Boolean> phsC = new Atribute<>(false);
    private Atribute<Boolean> neut = new Atribute<>(false);

}
