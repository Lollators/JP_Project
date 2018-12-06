/**
 * Class Screen that implements ScreenSpec interface.
 * This class specifies the screen that will be used in Movie Players
 *
 * @author  Luca Missaglia
 * @since   2018-10-27
 */
public class Screen implements ScreenSpec {

  /**
   * Resolution of screen (ex: 1920x1080).
   */
  private String resolution;

  /**
   * Refresh rate of screen.
   */
  private int refreshrate;

  /**
   * Response time of screen.
   */
  private int responsetime;

  /**
   * Class constructor that sets resolution, refreshrate, and responsetime of a screen.
   *
   * @param resolution - Resolution of screen (ex: 1920x1080)
   * @param refreshrate - Refresh rate of screen.
   * @param responsetime - Response time of screen.
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  /**
   * Function that returns the resolution of a screen.
   *
   * @return resolution - Resolution of the screen
   */
  public String getResolution() {
    return resolution;
  }

  /**
   * Function that returns the refresh rate of a screen.
   *
   * @return refreshrate - Refresh rate of the screen
   */
  public int getRefreshRate() {
    return refreshrate;
  }

  /**
   * Function that returns the response time of a screen.
   *
   * @return responsetime - Response time of the screen
   */
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * Overriding of method toString() in order to provide a more detailed description of Product.
   * This function will return the Screen resolution, refresh rate, and response time of
   * a screen.
   * A string variable is defined and used as a concatenation storage for the other class
   *  variables.
   *
   * @return message - Concatenated string of class variables
   */
  public String toString() {
    String message = "";

    message += "Screen : Resolution    : " + resolution + '\n';
    message += "Refresh Rate  : " + refreshrate + '\n';
    message += "Response Time : " + responsetime + '\n';

    return message;
  }
}
