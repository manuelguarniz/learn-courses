package com.futurelabs.switchingreplace;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Factory {
    private final CampBlindaje campBlindaje;
    private final CampFareco campFareco;
    private final CampCompetenciaFija campCompetenciaFija;
    private final CampPrepago campPrepago;
    private final CampRuleta campRuleta;

    public Factory(CampBlindaje campBlindaje, CampFareco campFareco, CampCompetenciaFija campCompetenciaFija, CampPrepago campPrepago, CampRuleta campRuleta) {
        this.campBlindaje = campBlindaje;
        this.campFareco = campFareco;
        this.campCompetenciaFija = campCompetenciaFija;
        this.campPrepago = campPrepago;
        this.campRuleta = campRuleta;
    }

    public IFactory getFactory(String cond) {
        switch (cond) {
            case "CAMP_FARECO_CHURN":
                return campFareco;
            case "CAMP_COMPETENCIA_FIJA":
                return campCompetenciaFija;
            case "CAMP_BLINDAJE":
                return campBlindaje;
            default:
                return campPrepago;
        }
    }

    public IFactory getFactoryV2(String cond) {
        return Stream.of(
                        new FactoryItem(campFareco, Arrays.asList("CAMP_FARECO")),//, "CAMP_FARECO_CHURN", "CAMP_FARECO_FRAC")),
                        new FactoryItem(campCompetenciaFija, Arrays.asList("CAMP_COMPETENCIA_FIJA")),
                        new FactoryItem(campRuleta, Arrays.asList("CAMP_RECARGA_ACUMULADA", "CAMP_RULETA")),
                        new FactoryItem(campBlindaje, Arrays.asList("BLINDAJE"))
                )
                .filter(e -> e.existConditional(cond))
                .map(FactoryItem::getFactory)
                .findFirst()
                .orElse(campPrepago);

    }
}

class FactoryItem {
    private IFactory factory;
    private List<String> conditionals;

    public FactoryItem(IFactory factory, List<String> conditionals) {
        this.factory = factory;
        this.conditionals = conditionals;
    }

    public IFactory getFactory() {
        return factory;
    }

    public void setFactory(IFactory factory) {
        this.factory = factory;
    }

    public List<String> getConditionals() {
        return conditionals;
    }

    public void setConditionals(List<String> conditionals) {
        this.conditionals = conditionals;
    }

    public boolean existConditional(String prefix) {
        return this.conditionals != null && this.conditionals.stream().anyMatch(e -> e.startsWith(prefix));
    }
}