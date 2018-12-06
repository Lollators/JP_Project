/**
 * Interface ScreenSpec that includes methods that will have to be implemented by Screen objects.
 *
 * @author  Luca Missaglia
 * @since   2018-10-27
 */
public interface ScreenSpec {

  /**
   * Function that returns the resolution of a screen.
   *
   * @return resolution - Resolution of the screen
   */
  public String getResolution();

  /**
   * Function that returns the refresh rate of a screen.
   *
   * @return refreshrate - Refresh rate of the screen
   */
  public int getRefreshRate();

  /**
   * Function that returns the response time of a screen.
   *
   * @return responsetime - Response time of the screen
   */
  public int getResponseTime();

}
