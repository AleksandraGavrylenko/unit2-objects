import greenfoot.*;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor 
{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;

    public String getType(){
    return type;
    }
    public void attack(String aName, User enemy){
        
    }
    public void takeDamage(int a){
        this.hp -= a;
    }
    public void heal(){
        this.hp++;
    }
    public void printAttack(){
        System.out.println("Oh noh I was attackeed");
    }
    public int getAttackPower(String aName, User enemy){
        return 0;
    }
    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon()
    {
    }


    
}
