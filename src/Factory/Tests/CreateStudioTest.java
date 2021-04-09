public class CreateStudioTest{
  public static void main (String[] args){
    StudioFactory studio;

    studio = new MarvelStudio();
    studio.createActionMovie();
    studio.createComedy();
    studio.createHororMovie();

    studio = new UniversalStudio();
    studio.createActionMovie();
    studio.createComedy();
    studio.createHororMovie();

    studio = new WarnerBrosStudio();
    studio.createActionMovie();
    studio.createComedy();
    studio.createHororMovie();
  }
}
