import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

   
public class App {
    public static int choice;
    public static int userPoint;
    public static int cmpPoint;
    public static String status;
    public static int userChoice;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> game = new ArrayList<>();
        Random rand = new Random();
        userPoint = 0;
        cmpPoint = 0;

            game.add("Rock");
            game.add("Paper");
            game.add("Scissor");
            
        System.out.println("Welcome! \nLets play Rock Paper Scissor");
        while (true){
            
            System.out.println("Enter '0' for Rock \nEnter '1' for Paper \nEnter '2' for Scissor\n");
            while(true){
                System.out.print("You choose: ");
                userChoice = sc.nextInt();      // ask user for input
                if(userChoice < game.size()){
                    break;
                }
                System.out.println("Wrong choice, choose again");
            }
        
            System.out.println("You choose "+ userChoice+ ": "+ game.get(userChoice));      // displays the users choice
            int cmpChoice = rand.nextInt(game.size());          //get random choice for computer between 0 - array size
            System.out.println("Computer choose: "+ cmpChoice +" : "+ game.get(cmpChoice) +"\n");        // display computer choice
            
            if(game.get(userChoice) == game.get(cmpChoice)){
                System.out.println("Its a Draw!\n");
            }
            if((game.get(userChoice) == "Rock" && game.get(cmpChoice) == "Scissor") 
            || (game.get(userChoice) == "Scissor" && game.get(cmpChoice) == "Paper") 
            || (game.get(userChoice) == "Paper" && game.get(cmpChoice) == "Rock")){
                userPoint +=1;
                System.out.println("You win!    +1 point\n");
            }
            if((game.get(cmpChoice) == "Rock" && game.get(userChoice) == "Scissor") 
            || (game.get(cmpChoice) == "Scissor" && game.get(userChoice) == "Paper") 
            || (game.get(cmpChoice) == "Paper" && game.get(userChoice) == "Rock")){
                cmpPoint +=1;
                System.out.println("Computer win!   +1 point\n");
            }

            System.out.println("Play again? Enter '1' for Yes and '0' for No");
            int play = sc.nextInt();
            if(play == 0){
                break;
            }
        }
    
        if(userPoint > 0){
            System.out.println("You gained "+ userPoint +" points");
        }
        else{
            System.out.println("You gained "+ userPoint +" point");
        }
        if(cmpPoint > 0){
            System.out.println("Computer gained "+ cmpPoint +" points");
        }
        else{
            System.out.println("Computer gained "+ cmpPoint +" point");
        }

    }

}
