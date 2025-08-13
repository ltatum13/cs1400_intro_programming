// Laila Tatum
// CS 1400
// Assignment 3
// 24 March 2025

public class Person
{
   String name;
   int age;
   String favFood;

   public Person(String name, int age, String favFood)
   {
    this.name = name;
    this.age = age;
    this.favFood = favFood;
   }

    public Person(Person object2)
    {
        name = object2.name;
        age = object2.age;
        favFood = object2.favFood;
    }

   public void setName(String name)
   {
    this.name = name;
   }

   public void setAge(int age)
   {
    this.age = age;
   }

   public void setFavFood(String favFood)
   {
    this.favFood = favFood;
   }

   public String getName()
   {
    return name;
   }
   
   public int getAge()
   {
    return age;
   }
   
   public String getFavFood()
   {
    return favFood;
   }

    public boolean equals(Person object2)
    {
        boolean status;
        if((name == object2.name) && (age == object2.age) && (favFood == object2.favFood))
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }

    public String toString()
    {
        String output = name + ", " + age + ", " + favFood;
        return output;
    }
}