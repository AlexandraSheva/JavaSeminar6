import java.util.List;

public class Cat {
  
  private String name ;

  private String owner ;

  private String breed ;

  private int age ;

  private List<String> healthHistory ;

  public Cat (String name,String owner,String breed, int age) {
    this.name = name;
    this.owner = owner;
    this.breed = breed;
    this.age = age;
   }

   public String getName() {
    return name;
  }

  public int getAge() {
    return age;
}

public String getBreed() {
    return breed;
  }

public String getOwner() {
    return owner;
  }

public String toString() {
  return "name: " + name + " " + "owner: " + owner + " " + "age: " + age + " " + "breed: " + breed;
}

  }

  

  
