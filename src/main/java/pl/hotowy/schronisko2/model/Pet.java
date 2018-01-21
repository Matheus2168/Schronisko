package pl.hotowy.schronisko2.model;

public class Pet {

    private String name;
    private String description;
    private Type type;
    private String imgSrc;

    public Pet(String name, String description, Type type, String imgSrc) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
