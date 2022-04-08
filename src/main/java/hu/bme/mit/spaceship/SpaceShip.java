package hu.bme.mit.spaceship;

/**
* Defines basic spaceship functionality
* (collects just the most important ones currently)
*/
public interface SpaceShip {

  /**
  * Fires the laser or lasers of the ship
  *
  * @param firingMode how many lasers to fire
  * @return was the firing successful
  */
  public boolean fireLaser(FiringMode firingMode);

  /**
  * Fires the torpedo stores of the ship
  *
<<<<<<< HEAD
  * @param firingMode how many torpedo stores to fire at once
=======
  * @param firingMode how many torpedo stores to fire at the same time
>>>>>>> branch-B
  * @return whether the fire command was successful
  */
  public boolean fireTorpedo(FiringMode firingMode);
}
