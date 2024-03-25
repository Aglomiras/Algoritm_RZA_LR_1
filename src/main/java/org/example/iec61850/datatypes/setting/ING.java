package org.example.iec61850.datatypes.setting;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.common.Attribute;

@Getter
@Setter
public class ING {
    private Attribute<Integer> setVal = new Attribute<>(0);
}
