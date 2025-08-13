// Laila Tatum
// CS 1400
// Assignment 4
// 16 April 2025

public class Person
{
   String name;
   int age;
   String favFood;

   public Person(String name, int age, String favFood) throws Exception
   {
    this.name = name;
    this.favFood = favFood;
    
    if(age<0 || age>120)
    {
        throw new Exception("input a valid age");
    }
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
        if((name.equals(object2.name)) && (age == object2.age) && (favFood.equals(object2.favFood)))
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