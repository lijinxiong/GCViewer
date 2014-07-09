package com.tagtraum.perf.gcviewer.view.model;


/**
 * Listener interface for add / remove events from the {@link RecentResourceNamesModel}.
 * 
 * <p>Date: Oct 6, 2005</p>
 * <p>Time: 10:17:05 AM</p>
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public interface RecentResourceNamesListener {
    
    /**
     * Invoked, when an item is removed from the model.
     * 
     * @param e details about the item, that is removed
     */
    public void remove(RecentResourceNamesEvent e);
    
    /**
     * Invoked, when an item is added to the model.
     * 
     * @param e details about the item, that is added
     */
    public void add(RecentResourceNamesEvent e);
}
