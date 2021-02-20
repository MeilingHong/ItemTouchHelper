package co.paulburke.android.itemtouchhelperdemo.helper;


/**
 * Interface to notify an item ViewHolder of relevant callbacks from {@link
 *
 * @author Paul Burke (ipaulpro)
 */
public interface ItemTouchHelperViewHolder {

    /**
     * Implementations should update the item view to indicate it's active state.
     */
    void onItemSelected();


    /**
     * Called when the {@link ItemTouchHelper} has completed the move or swipe, and the active item
     * state should be cleared.
     */
    void onItemClear();
}
