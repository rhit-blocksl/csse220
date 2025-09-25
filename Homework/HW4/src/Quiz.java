/**
  * 
  * TODO (1) Implement this class and (2) Document using Javadoc comments as well as regular comments
  * 
  * If you are running a recent version of Eclipse, you can command Eclipse to generate the Javadoc .html file
  * by using the command from the menu bar: Project | Generate Javadoc...
  *
  * 
 */
public class Quiz {
    private int id;
    private Question[] questions;
    public Quiz(int id, Question[] questions){
    this.id = id;
    this.questions = questions;
    }
    public int getId(){
    return id;
    }
    public Question[] getQuestions(){
        return questions;
    }

    public void displayQuiz(){
        System.out.println("Quiz ID: " + id);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }

    }

}
