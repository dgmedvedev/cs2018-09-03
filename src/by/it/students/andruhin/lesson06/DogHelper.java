package by.it.students.andruhin.lesson06;

public class DogHelper
{
    public static void printAllNames(Dog[] dogs)
    {
        for (int i = 0; i < dogs.length; i++)
        {
            System.out.print(dogs[i].getName() + " ");
        }
        System.out.print("\n");
    }

    public static double averageAge(Dog[] dogs)
    {
        int res = 0;

        for (int i = 0; i < dogs.length; i++)
        {
            res += dogs[i].getAge();
        }

        return (double)res / dogs.length;
    }
}