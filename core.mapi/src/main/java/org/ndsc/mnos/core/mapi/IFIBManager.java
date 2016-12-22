package org.ndsc.mnos.core.mapi;

import java.util.Set;

/**
 * Created by msp on 1/13/16.
 */
public interface IFIBManager {

    /**
     * Returns all FlowModEntries stored in the GlobalFIB.
     *
     * @return Set of FlowModEntries.
     */
    Set<IFlowModEntry> getFlowModEntries();

    /**
     * Returns all Intents identified by the GlobalFIB.
     *
     * @return Set of Intents.
     */
    Set<IIntent> getIntents();
}
