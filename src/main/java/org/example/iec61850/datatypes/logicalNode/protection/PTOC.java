package org.example.iec61850.datatypes.logicalNode.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.datatypes.logicalNode.common.LN;
import org.example.iec61850.datatypes.measurements.WYE;
import org.example.iec61850.datatypes.protection.ACD;
import org.example.iec61850.datatypes.protection.ACT;
import org.example.iec61850.datatypes.setting.ASG;
import org.example.iec61850.datatypes.setting.ING;

@Getter
@Setter
public class PTOC extends LN {
    //str - start, когда подается сигнал


    public static double dt = 0.250; // сек
    /**Входы*/
    public WYE A = new WYE();

    /**Выходы*/
    public ACD Str = new ACD();
    public ACT Op = new ACT();

    /**Уставки*/
    public ASG StrVal = new ASG();
    public ING OpDlTmms = new ING();
    /**Переменные*/
    private int cntTimeA = 0;
    private int cntTimeB = 0;
    private int cntTimeC = 0;
    @Override
    public void process() {
        boolean strA = A.getPhsA().getCVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();
        boolean strB = A.getPhsB().getCVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();
        boolean strC = A.getPhsC().getCVal().getMag().getF().getValue() > StrVal.getSetMag().getF().getValue();


    }
}
