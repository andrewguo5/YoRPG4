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
  
  /*
  methods here
  */
}
