public class Scout extends Character {
  
  private String _name;
  
  public Scout () {
      _hp = 85;
      _str = 25;
      _def = 16;
      _atk = 0.3;
  }
  
  public Scout (String newName) {
    this();
    _name = newName;
  }
  
  /*
  methods here
  */
}
