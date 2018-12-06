/**
 * Class MoviePlayer that is a subclass of Product and implements the MultimediaControl interface.
 * We require a concrete class that will allow us to capture the details of an Movie player.
 * The main difference between these and the audio players is that they contain screens.
 *
 * @author  Luca Missaglia
 * @since   2018-10-27
 */
public class MoviePlayer extends Product implements MultimediaControl {

  /**
   * Variable for type of monitor (will be retrieved from enum list).
   */
  MonitorType monitor;

  /**
   * Object screen, part of a movie player.
   */
  Screen playerScreen;

  /**
   * Class constructor that sets product name equal to the parameter passed to it, with
   * superclass constructor.
   * Then sets object playerScreen and monitor equal to parameters passed in.
   *
   * @param name - name of product
   * @param playerScreen - Object Screen
   * @param monitor - MonitorType enum
   */
  public MoviePlayer(String name, Screen playerScreen, MonitorType monitor) {
    super(name);
    this.playerScreen = playerScreen;
    this.monitor = monitor;
  }

  /**
   * Simple method that shows that an audio player is playing (assumed that someone pressed a
   * play button).
   */
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Simple method that shows that an audio player has stopped playing (assumed that someone
   * pressed a stop button).
   */
  public void stop() {
    System.out.println("Stopped");
  }

  /**
   * Simple method that shows that an audio player has skipped to a previous item(assumed that
   * someone pressed a back button).
   */
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Simple method that shows that an audio player has skipped to the next item(assumed that
   * someone pressed a next button).
   */
  public void next() {
    System.out.println("Next");
  }

  /**
   * Overriding of method toString() in order to provide a more detailed description of AudioPlayer.
   * This function will return the superclass toString() method, as well as the playerScreen
   * toString() method.
   * The monitor type will be shown as well.
   * A string variable is defined and used as a concatenation storage for the other class
   *  variables.
   *
   * @return message - Concatenated string of class variables and superclass method toString()
   */
  public String toString() {
    String message = "";

    message += super.toString();
    message += playerScreen.toString();
    message += "Monitor Type  : " + monitor + '\n';

    return message;
  }
}
