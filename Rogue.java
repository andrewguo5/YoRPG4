public class Rogue extends Character {
  
  private String _name;
  
  public Rogue () {
      _hp = 90;
      _str = 30;
      _def = 14;
      _atk = 0.35;
  }
  
  public Rogue(String newName) {
    this();
    _name = newName;
  }
  
  /*
  methods here
  */
}
