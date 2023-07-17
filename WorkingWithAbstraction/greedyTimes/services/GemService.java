package WorkingWithAbstraction.greedyTimes.services;

import WorkingWithAbstraction.greedyTimes.Gem;

public interface GemService {

    Gem findGemByName(String name);

    boolean containsGem(String name);
}
