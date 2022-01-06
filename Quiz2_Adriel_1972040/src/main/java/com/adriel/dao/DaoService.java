package com.adriel.dao;
/**
 * Adriel Rianson 1972040
 */

import java.util.List;

public interface DaoService<T>{
    public int addData(T data);

    public int delData(T data);

    public int updateData(T data);

    public List<T> showData();
}
