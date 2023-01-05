package Model;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private Double mark;
    
    public SinhVien() {
        this.id = "";
        this.name = "";
        this.age = 0;
        this.mark = 0.;
    }

    public SinhVien(String id, String name, int age, Double mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "SinhVien [id=" + id + ", name=" + name + ", age=" + age + ", mark=" + mark + "]";
    }

    
    
}
