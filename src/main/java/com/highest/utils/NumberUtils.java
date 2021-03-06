package com.highest.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtils {

    private static Logger logger = LoggerFactory.getLogger(NumberUtils.class);

    public static Boolean parseBoolean(String s) {
        if (s != null && s.length() > 0) {
            try {
                return Boolean.parseBoolean(s);
            } catch (Exception ex) {
                logger.error(ex.getMessage(), ex);
            }
        }
        return null;
    }

    /**
     * 字符串转Integer
     * @param s 字符串
     * @return 成功返回对应的数字，否则返回null
     */
    public static Integer parseInt(String s) {
        if (s != null && s.length() > 0) {
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    public static int parseInt(String s, int defaultValue) {
        Integer integer = parseInt(s);
        if (integer == null) {
            return defaultValue;
        }
        return integer;
    }

    /**
     * 字符串转Long
     * @param s 字符串
     * @return 成功返回对应的数字，否则返回null
     */
    public static Long parseLong(String s) {
        if (s != null && s.length() > 0) {
            try {
                return Long.parseLong(s);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    public static long parseLong(String s, long defaultValue) {
        Long longV = parseLong(s);
        if (longV == null) {
            return defaultValue;
        }
        return longV;
    }

    /**
     * 字符串转Double
     * @param s 字符串
     * @return 成功返回对应的数字，否则返回null
     */
    public static Double parseDouble(String s) {
        if (s != null && s.length() > 0) {
            try {
                return Double.parseDouble(s);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    public static double parseDouble(String s, double defaultValue) {
        Double doubleV = parseDouble(s);
        if (doubleV == null) {
            return defaultValue;
        }
        return doubleV;
    }

    /**
     * 字符串转Float
     * @param s 字符串
     * @return 成功返回对应的数字，否则返回null
     */
    public static Float parseFloat(String s) {
        if (s != null && s.length() > 0) {
            try {
                return Float.parseFloat(s);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    public static float parseFloat(String s, float defaultValue) {
        Float floatV = parseFloat(s);
        if (floatV == null) {
            return defaultValue;
        }
        return floatV;
    }

    public static Boolean valueOf(Boolean value) {
        return value != null ? value : false;
    }

    /**
     * 获取Integer对象的数值
     * @param value Integer对象
     * @return value不为空返回value，否则返回0
     */
    public static Integer valueOf(Integer value) {
        return value != null ? value : 0;
    }

    /**
     * 获取Long对象的数值
     * @param value Long对象
     * @return value不为空返回value，否则返回0
     */
    public static Long valueOf(Long value) {
        return value != null ? value : 0L;
    }

    /**
     * 获取Double对象的数值
     * @param value Double对象
     * @return value不为空返回value，否则返回0
     */
    public static Double valueOf(Double value) {
        return value != null ? value : 0L;
    }

    /**
     * 获取Float对象的数值
     * @param value Float对象
     * @return value不为空返回value，否则返回0
     */
    public static Float valueOf(Float value) {
        return value != null ? value : 0L;
    }
}
