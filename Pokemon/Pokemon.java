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
    public Pokemon(int hp, int ap, String name, String attack, String type){
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.img = new GreenfootImage(name + ".png");
        setImage(this.img);
        this.attack = new Attack(attack);
        this.type = type;
    }    
    public String getType(){
    return type;
    }
    public void attack(String aName, User enemy){
        takeDamage(enemy.getPokemon().getAPower(aName, enemy));
    }
    public void takeDamage(int a){
        this.hp -= a;
        if(this.hp < 0){
            this.hp = 0;
        }
    }
    public void heal(){
        this.hp += 20;
    }
    public Attack getAttack(){
        return this.attack;
    }
    public void printAttack(){
        System.out.println(this.attack);
    }
    public boolean isOut(){
        return this.hp<=0;
    }
    public int getAPower(String aName, User enemy){
        Attack a = enemy.getPokemon().getAttack();
        return a.getPower();
    }
    public int getHp(){
        return this.hp;
    }
    public int getAp(){
        return this.ap;
    }
    public String getName(){
        return this.name;
    }
    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon()
    {
    }


    
}
