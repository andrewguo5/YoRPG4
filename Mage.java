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
  
  /*
  methods here
  */
}
