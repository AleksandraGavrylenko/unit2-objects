import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private Pokemon pokemon;
    public User(String na){
        this.name = na;
    }
    public void setPokemon(Pokemon p){
        this.pokemon = p;
    }
    public Pokemon getPokemon(){
        return this.pokemon;
    }
    public void Switch(){
        
    }
    public void heal(){
        
    }
    public void act()
    {
        // Add your action code here.
    }
}
