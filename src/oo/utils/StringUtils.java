
package oo.utils;

/**
 * @author suresh.gupta
 *
 */
public class StringUtils {
    private StringUtils() {
    }

    public static boolean isBlank(String string) {
        return string == null || !string.equals("");
    }

    public static boolean nonNull(String string) {
        return string != null && !string.equals("");
    }
}
