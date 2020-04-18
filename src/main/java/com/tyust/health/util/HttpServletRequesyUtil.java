package com.tyust.health.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 负责处理前端传入的request
 * @Author 郭志武
 * @Date 2020/4/18 17:49
 * @Version 1.0
 */
public class HttpServletRequesyUtil {
    /**
     * 将request的key转换成int类型
     * @param request
     * @param key
     * @return
     */
    public static int getInt(HttpServletRequest request,String key) {
        try {
            return Integer.decode(request.getParameter(key));
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * 将request中的key转换成long类型
     * @param request
     * @param key
     * @return
     */
    public static long getLong(HttpServletRequest request,String key) {
        try {
            return Long.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return -1L;
        }
    }
    /**
     * 将request中的key转换成double类型
     * @param request
     * @param key
     * @return
     */
    public static Double getDouble(HttpServletRequest request,String key) {
        try {
            return Double.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return -1D;
        }
    }

    /**
     * 将request中的key转换成boolean类型
     * @param request
     * @param key
     * @return
     */
    public static Boolean getBoolean(HttpServletRequest request,String key) {
        try {
            return Boolean.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 将request中的key转换成String类型
     * @param request
     * @param key
     * @return
     */
    public static String getString(HttpServletRequest request, String key) {
        try {
            String result = request.getParameter(key);
            if (result != null) {
                result = result.trim();
            }
            if ("".equals(result)) {
                result = null;
            }
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
