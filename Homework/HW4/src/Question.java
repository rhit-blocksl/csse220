/**
  * 
  * TODO (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
  *
  * If you are running a recent version of Eclipse, you can command Eclipse to generate the Javadoc .html file
  * by using the command from the menu bar: Project | Generate Javadoc...
  * 
 */
public class Question {
    private int id;
    private String text;
    public Question(int id, String text){
        this.id = id;
        this.text = text;
    }
    public int getId() {
        return id;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String toString() {
        return "Question [" + id + "]:" + text;
    }

}
