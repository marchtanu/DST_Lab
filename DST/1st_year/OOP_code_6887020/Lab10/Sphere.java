public class Sphere extends Object3D
{
  private double radius = 0;
  
  public Sphere(String _name, Material _matType, double _radius)
  {
    super(_name, _matType);
    this.radius = _radius;
  }

  public double getRadius()
  {
    return this.radius;
  }
  
  public double getVolume()
  {
    return (4.0/3.0) *3.14 * this.radius * this.radius * this.radius;
  }

  public double getSurface()
  {
    return 4 *3.14 * this.radius * this.radius;
  }
  
}
