package Lection05;

public class Colleague {
    private String fullName;
    private String post;
    private String email;
    private String telephone;
    private int wages;
    private int age;


    public String toString() {
        return "Colleague{" +
                "fullName='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", wages=" + wages +
                ", age=" + age +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

    public Colleague(String fullName, String post, String email, String telephone, int wages, int age) {
        this.fullName= fullName;
        this.post= post;
        this.email= email;
        this.telephone= telephone;
        this.wages=wages;
        this.age=age;


    }

    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getWages() {
        return wages;
    }

    public int getAge() {
        return age;
    }
}
