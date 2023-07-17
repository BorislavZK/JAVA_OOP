
package WorkingWithAbstraction.greedyTimes.services;

import WorkingWithAbstraction.greedyTimes.Cash;

public interface CashService {

    boolean containsCash(String name);

    Cash findCashByName(String name);
}
