public class UniversalStudio implements StudioFactory{

  @Override
  public ActionMovie createActionMovie(){
      return new unActionMovie ();
  }

  @Override
  public Comedy createComedy(){
      return new unComedy ();
  }

  @Override
  public Horor createHororMovie(){
      return new unHororMovie ();
  }

}
