package model;

public class Cat {
    // Criação de Variavéis 
    private String name;
    private String gender;
    private String age;
    private String weight;
    private String color;
    private String tipoDose;
    
    //Gerar Construtores
    public Cat() {
        this.name = "";
        this.gender = "";
        this.age = "";
        this.weight = "";
        this.color = "";
        this.tipoDose = "";
        
    }
    
    //
    public Cat(String name, String gender, String age, String weight, String color, String tipoDose) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.tipoDose = tipoDose;
        
    }
    
    // Gets e Sets
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

    public String getTipoDose() {
        return tipoDose;
    }

    public void setTipoDose(String tipoDose) {
        this.tipoDose = tipoDose;
    }

    public String printCat (){
        return "\nInformações do gato:"+
        "\nNome: " +this.name+
        "\nIdade: " +this.age+
        "\nAltura: " +this.weight+
        "\nCor: " +this.color+
        "\nGenêro: " +this.gender+
        "\nTipo de Dose: " +this.tipoDose
        
        //
        ;
    }

    

    @Override
    public String toString() {
        return "Cat [name=" + name + ", gender=" + gender + ", age=" + age + ", weight=" + weight + ", color=" + color
                + ", tipoDose=" + tipoDose + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((tipoDose == null) ? 0 : tipoDose.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (weight == null) {
            if (other.weight != null)
                return false;
        } else if (!weight.equals(other.weight))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (tipoDose == null) {
            if (other.tipoDose != null)
                return false;
        } else if (!tipoDose.equals(other.tipoDose))
            return false;
        return true;
    }

    public double doseVermifugo(String tipoDose) {
        double doseVermifugo = 0;
        if(tipoDose.equals("anual")){
            doseVermifugo = Double.parseDouble(this.weight)/1.0;
        }else if (tipoDose.equals("semestral")){
            doseVermifugo = Double.parseDouble(this.weight)/0.5;
        }

        return doseVermifugo;
    }

    public void envelhece() {
        this.age+=1;
    }
}

//override faz com que
