public class Mage extends Character {
  
  private String _name;
  
  public Mage () {
      _hp = 85;
      _str = 15;
      _def = 12;
      _atk = 0.8;
  }
  
  public Archer (String newName) {
    this();
    _name = newName;
  }
  
  //The mage casts a magical barrier that has a 66% chance to nullify all damage, however, the mage halves their offensive power
  public void specialize() {
    if (Math.random() < 0.66) 
      _def *= 1000;
    _atk = 0.4
    }
  
  public void normalize() {
      _def = 12;
      _atk = 0.8;
  }
}
