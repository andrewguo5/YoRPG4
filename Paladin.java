public class Paladin extends Character {
  
  private String _name;
  
  public Paladin () {
      _hp = 120;
      _str = 30;
      _def = 18;
      _atk = 0.25;
  }
  
  public Paladin (String newName) {
    this();
    _name = newName;
  }
  
  /*
  methods here
  */
}
