/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * If the id does not appear as a key in this map,
     * then add the key,item pair to this map.
     *
     * @param id key corresponding to item
     * @param item new drivable item to be added in this map
     * @return whether item was added to this map
     */
    public boolean addDrivable(String id, Drivable item){
        if (!drivable_map.containsKey(id)) {
            drivable_map.put(id, item);
            return true;
        } else
            return false;
    }




    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Returns true iff there is at least one item in this map
     * that has a maxSpeed >= the speed given.
     *
     * @return whether the map contains item that is faster than
     *         the given speed
     *
     */
    public boolean hasFasterThan(int speed){
        for (Drivable item: drivable_map.values()){
            if (item.getMaxSpeed() >= speed)
                return true;
        }
        return false;
    }




    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    /**
     * Returns List of all Tradable items in this map
     *
     * @return List of all Tradable items in this map
     */
    public List<Tradable> getTradable() {
        List<Tradable> result = new ArrayList<>();
        for (Drivable item: drivable_map.values()){
            if (item instanceof Tradable)
                result.add((Tradable) item);
        }
        return result;
    }



    
}