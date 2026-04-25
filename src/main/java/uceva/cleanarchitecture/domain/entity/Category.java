package uceva.cleanarchitecture.domain.entity;

public class Category {
    public Integer id;
    public String name;
    public String area;

    public Category(Integer id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }
}
