package org.example;

public class StringUtils {
    public boolean isPositiveNumber(String str) {

        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            int result = org.apache.commons.lang3.StringUtils.compare(str, "0");
            return result > 0;
        }
        return false;
    }
}
