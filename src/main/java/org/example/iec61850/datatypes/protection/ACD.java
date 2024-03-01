package org.example.iec61850.datatypes.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.common.Atribute;

@Getter
@Setter
public class ACD extends ACT {
    private Atribute<Direction> dirgenreal = new Atribute<>(Direction.unknown);
    private Atribute<Direction> dirphsA = new Atribute<>(Direction.unknown);
    private Atribute<Direction> dirphsB = new Atribute<>(Direction.unknown);
    private Atribute<Direction> dirphsC = new Atribute<>(Direction.unknown);
    private Atribute<Direction> dirneut = new Atribute<>(Direction.unknown);
}
