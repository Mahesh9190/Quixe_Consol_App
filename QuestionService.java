import java.util.Scanner;

public class QuestionService 
{
	Question [] questions=new Question[5];
	String selection[]=new String[5];
	
	public QuestionService()
	{
		questions[0]=new Question(1,"Which language discoverd in 1995?","java","python","cpp","c#","java");
		questions[1]=new Question(1,"size of int?","2","4","8","16","4");
		questions[2]=new Question(1,"size of double?","2","4","8","16","8");
		questions[3]=new Question(1,"size of char?","2","4","8","16","2");
		questions[4]=new Question(1,"size of long?","2","4","8","16","8");
	}
	
	public  void PlayQuiz()
	{
		int i=0;
		for(Question q:questions) {
		System.out.print("Q"+q.getId()+") ");
		System.out.println(q.getQuestion());
		System.out.println(q.getOpt1());
		System.out.println(q.getOpt2());
		System.out.println(q.getOpt3());
		System.out.println(q.getOpt4());
		Scanner sc=new Scanner(System.in);
		selection[i]  =sc.nextLine();
		i++;
		
		}
		for(String s:selection)
		{
			System.out.println(s);
		}
	}
	public void printScore()
	{
		int score=0;
		for(int i=0;i<questions.length;i++)
		{
			Question que=questions[i];
			String answer=que.getAnswer();
			
			String userAnswer=selection[i];
			
			if(answer.equals(userAnswer))
			{
				score++;
			}
			
		}
		System.out.println("Your Score is : "+ score);
	}
	

}