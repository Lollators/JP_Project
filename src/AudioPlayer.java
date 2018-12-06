/**
 * Class AudioPlayer that is a subclass of Product and implements the MultimediaControl interface.
 * We require a concrete class that will allow us to capture the details of an audio player.
 *
 * @author  Luca Missaglia
 * @since   2018-10-27
 */
public class AudioPlayer extends Product implements MultimediaControl {
  /**
   * Type of audio file (mp3, wav, etc).
   */
  private String audioSpecification;

  /**
   * Media type (will be retrieved from enum list).
   */
  private ItemType mediaType;

  /**
   * Class constructor that sets product name equal to the parameter passed to it, with
   * superclass constructor.
   * Then sets the audio specification to a string value passed in as parameter.
   * Lastly, sets the media type to AU (Audio).
   *
   * @param name - name of product
   * @param audioSpecification - specification of audio (mp3, wav, etc)
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AU;
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
   * This function will return the superclass toString() method, as well as the audio specification
   * and item Type (provided in enum).
   * A string variable is defined and used as a concatenation storage for the other class
   *  variables.
   *
   * @return message - Concatenated string of class variables and superclass method toString()
   */
  public String toString() {
    String message = "";

    message += super.toString();
    message += "Audio Spec    : " + audioSpecification + '\n';
    message += "Type          : " + mediaType.description + '\n';

    return message;
  }
}
