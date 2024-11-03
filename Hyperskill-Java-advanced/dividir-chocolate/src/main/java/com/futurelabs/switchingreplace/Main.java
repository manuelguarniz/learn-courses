package com.futurelabs.switchingreplace;

public class Main {
    public static void main(String[] args) {

        String caso = "CAMP_FARECO";

        CampBlindaje campBlindaje = new CampBlindaje();
        CampFareco campFareco = new CampFareco();
        CampCompetenciaFija campCompetenciaFija = new CampCompetenciaFija();
        CampPrepago campPrepago = new CampPrepago();
        CampRuleta campRuleta = new CampRuleta();

        Factory factory = new Factory(campBlindaje, campFareco, campCompetenciaFija, campPrepago, campRuleta);
        factory.getFactoryV2(caso).printing();
    }
}
