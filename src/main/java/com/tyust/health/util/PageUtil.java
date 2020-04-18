package com.tyust.health.util;

/**
 * 分页逻辑工具类
 * @Author 郭志武
 * @Date 2020/4/18 16:26
 * @Version 1.0
 */
public class PageUtil {

    /**
     * 将页码转换为rowIndex
     * @param pageIndex 页码
     * @param pageSize  页面大小，即每页存放的最大数据条数
     * @return  rowIndex 告诉DAO层从数据库的第几行开始取
     */
    public static int calculateRowIndex(int pageIndex,int pageSize) {
        return (pageIndex > 0)?(pageIndex - 1) * pageSize : 0;
    }
}
