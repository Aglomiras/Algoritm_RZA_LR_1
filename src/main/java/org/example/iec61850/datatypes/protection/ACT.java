package org.example.iec61850.datatypes.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
import org.example.iec61850.datatypes.common.Attribute;

@Getter
@Setter
public class ACT extends Data {
    private Attribute<Boolean> genreal = new Attribute<>(false);
    private Attribute<Boolean> phsA = new Attribute<>(false);
    private Attribute<Boolean> phsB = new Attribute<>(false);
    private Attribute<Boolean> phsC = new Attribute<>(false);
    private Attribute<Boolean> neut = new Attribute<>(false);

}
