package org.example.iec61850.datatypes.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.common.Attribute;

@Getter
@Setter
public class ACD extends ACT {
    private Attribute<Direction> dirgenreal = new Attribute<>(Direction.unknown);
    private Attribute<Direction> dirphsA = new Attribute<>(Direction.unknown);
    private Attribute<Direction> dirphsB = new Attribute<>(Direction.unknown);
    private Attribute<Direction> dirphsC = new Attribute<>(Direction.unknown);
    private Attribute<Direction> dirneut = new Attribute<>(Direction.unknown);
}
