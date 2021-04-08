public class WarnerBrosStudio implements StudioFactory{

  @Override
  public ActionMovie createActionMovie(){
      return new wbActionMovie ();
  }

  @Override
  public Comedy createComedy(){
      return new wbComedy ();
  }

  @Override
  public Horor createHororMovie(){
      return new wbHororMovie ();
  }

}
