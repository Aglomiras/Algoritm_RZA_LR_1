package org.example.iec61850.datatypes.measurements;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.Data;
import org.example.iec61850.datatypes.common.Quality;
import org.example.iec61850.datatypes.common.Vector;

@Getter
@Setter
public class CMV extends Data {

    private Vector cVal = new Vector();
    private Quality quality = new Quality();


}
