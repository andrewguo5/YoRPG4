public class Mage extends Character {
  
  private String _name;
  
  public Mage () {
      _hp = 85;
      _str = 25;
      _def = 12;
      _atk = 1.0;
  }
  
  public Mage (String newName) {
    this();
    _name = newName;
  }
  
  //The mage casts a magical barrier that has a 66% chance to nullify all damage, however, the mage halves their offensive power
  public void specialize() {
    if (Math.random() < 0.66) 
      _def *= 1000;
    _atk = 0.5;
    }
  
  public void normalize() {
      _def = 12;
      _atk = 0.8;
  }
  
  public String about() {
      return "A powerful mage, whose spells deal heavy damage. To compensate for her physical weakness, she casts defensive barriers to protect her from incoming damage.";
  }
}
