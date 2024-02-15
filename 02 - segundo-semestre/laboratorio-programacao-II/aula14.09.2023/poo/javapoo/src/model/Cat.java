package model;

public class Cat {
    private String name;
    private String gender;
    private String age;
    private String weight;
    private String color;

    public Cat() {
        this.name = "";
        this.gender = "";
        this.age = "";
        this.weight = "";
        this.color = "";
    }

    //overload é a sobrecarga de metodos dentro da propria clase atraves da alteracao de parametros
    public Cat(String name, String gender, String age, String weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}