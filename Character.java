/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG

  Ye Olde Adventure Land is populated by a wide variety of characters.
  One may encounter, for instance, warriors, mages, archers, rogues,
  healers, clerics, fairies, or even monsters of assorted shapes and sizes.
  However, there are certain things all of these entities have in common.
  These commonalities are expressed below. Read on!
  =============================================*/

public abstract class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int _hp;
    protected int _str;
    protected int _def;
    protected double _atk;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hp = 125;
	_str = 100;
	_def = 40;
	_atk = .4;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _def; }

    public abstract String getName();
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hp > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on instance of class Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
            Calls opponent's lowerHP() method to inflict damage. 
	    Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

	int damage = (int)( (_str * _atk) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hp = _hp - damageInflicted;
    }


    /*=============================================
      void specialize() -- prepare a character to deliver a special attack
      pre:  n/a
      post: varies by class
      =============================================*/
    public abstract void specialize();


    /*=============================================
      void normalize() -- reset a character to normal mode
      pre:  n/a
      post: varies by class
      =============================================*/
    public abstract void normalize();


    /*=============================================
      String about() -- gives a categorical description of a type of entity
      pre:  
      post: returns String describing this class
      =============================================*/
    public static String about() { 
	//boilerplate text, should a subclass not override this method
	return "Random RPG character, capable of many things.";
    }


}//end class Character
