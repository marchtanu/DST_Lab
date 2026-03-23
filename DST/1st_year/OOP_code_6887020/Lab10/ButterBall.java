public class ButterBall extends Sphere implements Meltable, Comparable<ButterBall>
{
  public ButterBall(String _name, double _radius)
  {
    super(_name, Material.Butter, _radius);
  }

  @Override
  public int compareTo(ButterBall other)
  {
    double thisSurface = this.getSurface();
    double otherSurface = other.getSurface();
    
    if (thisSurface < otherSurface) {
        return -1;
    } else if (thisSurface > otherSurface) {
        return 1;
    } else {
        return 0;
    }
  }
  
  public Object3D convertToOtherShape()
  {
    double edge = Math.cbrt(this.getVolume());
    return new Cube(this.getName(), this.getMaterial(), edge);
  }
}
