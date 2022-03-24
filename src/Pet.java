public class Pet {

// pet variables
private String name;
private int age;
private String location;
private String type;

public Pet(){
}  

public Pet( String name, int age, String location, String type){
    name = this.name;
    age = this.age;
    location = this.location;
    type = this.type;

} 
//get methods
public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getType() {
    return type;
}

//set methods
public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    this.age = age;
}

public void setLocation(String location) {
    this.location = location;
}
}
