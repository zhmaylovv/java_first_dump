public class MarvelStudio implements StudioFactory{

  @Override
  public ActionMovie createActionMovie(){
      return new mrvlActionMovie ();
  }

  @Override
  public Comedy createComedy(){
      return new mrvlComedy ();
  }

  @Override
  public Horor createHororMovie(){
      return new mrvlHororMovie ();
  }

}
