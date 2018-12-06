/**
 * Interface Item that includes enum codes for different types of products.
 * The interface defines the proper getters and setters that inheriting classes will implement.
 *
 * @author  Luca Missaglia
 * @since   2018-09-29
 */

import java.util.Date;

public interface Item {

  /**
   * Declaration of manufacturer constant.
   */
  public final String manufacturer = "OracleProduction";

  /**
   * Function that sets the production number of a product.
   *
   * @param prodNumber - production number of product
   */
  void setProductionNumber(int prodNumber);

  /**
   * Function that sets the name of a product.
   *
   * @param name - name of item
   */
  void setName(String name);

  /**
   * Function that returns the name of a product.
   *
   * @return String - name of product
   */
  String getName();

  /**
   * Function that returns the manufacturing date of a product.
   *
   * @return Date - manufacturing date of product
   */
  Date getManufactureDate();

  /**
   * Function that returns the serial number of a product.
   *
   * @return int - SN of product
   */
  int getSerialNumber();
}
