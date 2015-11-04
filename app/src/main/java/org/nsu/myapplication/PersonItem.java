package org.nsu.myapplication;

/**
 * Created by iBrain on 02-11-2015.
 */
public class PersonItem {
    String name;
    String nickName;
    String department;
    int imageResId;

    public PersonItem(String name, String nickName, String department, int imageResId) {
        this.name = name;
        this.nickName = nickName;
        this.department = department;
        this.imageResId = imageResId;
    }
}
