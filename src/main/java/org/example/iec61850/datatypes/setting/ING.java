package org.example.iec61850.datatypes.setting;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.common.Atribute;

@Getter
@Setter
public class ING {
    private Atribute<Integer> setVal = new Atribute<>(0);
}
