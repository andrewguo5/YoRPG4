public class Archer extends Character {
  
  private String _name;
  
  public Archer () {
      _hp = 90;
      _str = 30;
      _def = 16;
      _atk = 0.5;
  }
  
  public Archer (String newName) {
    this();
    _name = newName;
  }
  
  public String getName() {
    return _name;
  }
  
  //Specialize grants a 66% chance on usage to deal double damage, but decreased defense for a turn
  public void specialize() {
    _def = 7
      + (int)(Math.random()*2);
    if (Math.random() < 0.66)
      _atk *= 2;
    }
    
    public void normalize() {
      _def = 16;
      _atk = 0.5;
    }
}
