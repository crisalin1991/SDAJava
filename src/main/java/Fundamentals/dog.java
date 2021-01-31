package Fundamentals;

public class dog {
    private String name;

    public dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(dog dog) {
        return(this.name.equals(dog.getName()));
    }

}
