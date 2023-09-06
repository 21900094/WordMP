package org.example;

public interface ICRUD {
    public Object add();
    public int updateObject(Object obj);
    public int deleteObject(Object obj);
    public void selectObject(int id);
}
