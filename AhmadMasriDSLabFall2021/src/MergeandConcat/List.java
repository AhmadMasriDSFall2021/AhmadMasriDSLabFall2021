/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeandConcat;

/**
 *
 * @author ahmad
 */
public interface List {

    void add(Object newElement);

    Object get(int index);

    int indexOf(Object element);

    Object remove(int index);

    boolean remove(Object element);

    int size();

}