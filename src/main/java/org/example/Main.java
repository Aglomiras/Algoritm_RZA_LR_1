package org.example;

import org.example.iec61850.datatypes.logicalNode.common.LN;
import org.example.iec61850.datatypes.logicalNode.measurement.MMXU;
import org.example.iec61850.datatypes.logicalNode.protocol.LSVS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<LN> logicalNode = new ArrayList<>();
    private static String path = "C:\\Users\\Aglomiras\\Изображения\\Рабочий стол\\AlgoritmRZAProgrammRealize\\Начало линии\\";
    private static String name = "PhAB80";
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        /**
         * Разделы МЭК 61850:
         * 3, 4, 5, 6 - которыми будем пользоваться
         * 8 - Goose протокол
         * 9 - SV протокол
         *
         * Раздел 7-3: описаны типы данных в защите
         * - булевые значения;
         * - целые значения;
         * - вещественные значения;
         * - ACT/ACD;
         * - enum значения;
         * - сигналы для измерения;
         * - SEQ значения (гармоники);
         *
         * Раздел 7-4: создание узлов
         * Узлы делятся на несколько типов.
         * GGIO - узел, позволяющий контролировать кнопки и лампочки на терминале;
         * группа P - узлы защиты (реализованы и автоматики);
         * группа A - узлы автоматики (не защита);
         *
         * RDIR - узел для реализации контроля направления в защитах;
         * RMXU - узел для определения дифференциальных токов;
         *
         * группа T - узлы датчики;
         * группа X - узлы заземлителей и заземляющих ножей;
         *
         * LSVS - узел, который подписывается на SV поток, парсит их и дает необходимые значения;
         *
         * */

        LSVS lsvs = new LSVS();
        lsvs.setPath(path);
        lsvs.setFileName(name);
        logicalNode.add(lsvs);


        MMXU mmxu = new MMXU();
        mmxu.IaInst = lsvs.getOut().get(0);
        mmxu.IbInst = lsvs.getOut().get(1);
        mmxu.IcInst = lsvs.getOut().get(2);

        while (lsvs.hasNext()) {
            logicalNode.forEach(LN::process);
            System.out.println();
        }


    }
}