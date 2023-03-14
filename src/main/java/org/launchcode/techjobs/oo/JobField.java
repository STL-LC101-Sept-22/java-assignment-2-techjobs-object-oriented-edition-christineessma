package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    private static int nextId = 1;
    private String value;
    //common fields

    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    //common constructors

    public int getId(){
        return id;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    //common getters and setters

    @Override
    public String toString() {
        return value;
    }
    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField that = (JobField) o;
        return id == that.id && Objects.equals(value, that.value);
    }
    //custom methods


}
