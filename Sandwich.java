// Filename:Sandwich.java  
//Author:Damian Lester   
//Date:1.24.19


public class Sandwich 
{
    
    private String mainIngredient;
    private String mainBread;
    private Double mainPrice;

    //New default constructor for objects
    public Sandwich()
    {

        mainPrice = 10.99;
    }

    //Mutator Methods (Setters)
    public void setIngredient(String ingredient)
    {

        mainIngredient = ingredient;
    }

    public void setBread(String bread){

        mainBread = bread;
    }

    //Accessor Methods (getters)
    public String getIngredient()
    {
        return mainIngredient;
    }

    public String getBread()
    {
        return mainBread;
    }

    public double getPrice()
    {
        return mainPrice;
    }
}