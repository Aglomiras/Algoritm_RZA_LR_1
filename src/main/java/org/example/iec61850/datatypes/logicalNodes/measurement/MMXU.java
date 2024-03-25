package org.example.iec61850.datatypes.logicalNodes.measurement;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.logicalNodes.common.LN;
import org.example.iec61850.datatypes.measurements.SAV;
import org.example.iec61850.datatypes.measurements.WYE;
import org.example.utils.Filter;
import org.example.utils.MsdFilter;

@Getter
@Setter
public class MMXU extends LN {

    public static int bufSize = 80;

    /**Входы*/
    public SAV UaInst = new SAV();
    public SAV UbInst = new SAV();
    public SAV UcInst = new SAV();
    public SAV IaInst = new SAV();
    public SAV IbInst = new SAV();
    public SAV IcInst = new SAV();
    /**Выход*/
    public WYE A = new WYE();

    /**Переменные*/

    private final Filter ia = new MsdFilter(bufSize);
    private final Filter ib = new MsdFilter(bufSize);
    private final Filter ic = new MsdFilter(bufSize);

    @Override
    public void process() {
        this.ia.process(this.IaInst, A.getPhsA().getCVal());
        this.ia.process(this.IbInst, A.getPhsB().getCVal());
        this.ia.process(this.IcInst, A.getPhsC().getCVal());
    }
}
