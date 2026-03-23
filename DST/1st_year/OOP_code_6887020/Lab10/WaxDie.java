public class WaxDie extends Cube implements Meltable, Comparable<WaxDie>
{
  //Constructor
  public WaxDie(String _name, double _edge)
  {
    super(_name, Material.Wax, _edge);
  }

  @Override
  public int compareTo(WaxDie other)
  {
    double thisVolume = this.getVolume();
    double otherVolume = other.getVolume();
    
    if (thisVolume < otherVolume) {
        return -1;
    } else if (thisVolume > otherVolume) {
        return 1;
    } else {
        return 0;
    }
  }
  
  public Object3D convertToOtherShape()
  {
    double radius = Math.cbrt(this.getVolume() * 3 / (4 * 3.14));
    return new Sphere(this.getName(), this.getMaterial(), radius);

  }
}
