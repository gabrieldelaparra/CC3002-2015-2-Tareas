package sh4j.model.browser;

import java.util.ArrayList;
import java.util.List;

/**
 * SPackage Class.
 *
 * @author Gabriel De La Parra
 * @version 1.0
 */
public class SPackage extends SObject {
  /**
   * Package name.
   */
  private final String name;
  /**
   * Classes collection.
   */
  private final List<SClass> classes;

  /**
   * Constructor.
   *
   * @param name Name of the Package.
   */
  public SPackage(String name) {
    classes = new ArrayList<SClass>();
    this.name = name;
  }

  /**
   * Add a Class to the Package.
   *
   * @param addedClass Class to be added.
   */
  public void addClass(SClass addedClass) {
    classes.add(addedClass);
  }

  /**
   * Class collection getter.
   *
   * @return Returns the Class Collection.
   */
  public List<SClass> classes() {
    return classes;
  }

  /**
   * Package Name getter.
   *
   * @return Returns the current Package Name.
   */
  public String toString() {
    return name;
  }

  /**
   * UI Icon getter.
   *
   * @return Returns the UI Icon.
   */
  @Override
  public String icon() {
    int size = classes.size();
    if (size > 0) {
      return "./resources/package_mode.gif";
    } else {
      return "./resources/pack_empty_co.gif";
    }
  }
}
