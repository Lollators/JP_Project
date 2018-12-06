/**
 * Interface Multimedia Control that specifies basic functionality that all items on a
 * production line should have.
 *
 * @author  Luca Missaglia
 * @since   2018-10-26
 */

public interface MultimediaControl {
  /**
   * Method that allows product to play audio or video.
   */
  public void play();

  /**
   * Method that allows product to stop playing audio or video.
   */
  public void stop();

  /**
   * Method that allows product to go to previous item (audio/video).
   */
  public void previous();

  /**
   * Method that allows product to go to next item (audio/video).
   */
  public void next();
}
