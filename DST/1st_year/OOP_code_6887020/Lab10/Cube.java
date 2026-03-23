public class Cube extends Object3D
{
  private double edge = 0;
  
  public Cube(String _name, Material _matType, double _edge)
  {
    super(_name, _matType);
    this.edge = _edge;
  }
  
  public double getEdge()
  {
    return this.edge;
  }

  public double getVolume()
  {
    return this.edge * this.edge * this.edge;
  }
  
  public double getSurface()
  {
    return 6 * this.edge * this.edge;
  }
  
}
