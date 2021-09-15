package Lesson_8.example_4.entities;

import Lesson_8.example_4.ValidatorStub;

public abstract class Entity implements Validatable {

    protected String uuid;
    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void validate(){
        ValidatorStub.validateEntity(this);
    }
}
