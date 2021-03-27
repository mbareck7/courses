/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.dao;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IDao<T> {
    void saveOne(T o);
    T getOne(T id);
    ArrayList<T> getAll();
    void updateOne(T o);
}