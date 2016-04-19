import java.util.Scanner;

public class AssignGrades {
  public static void main(String[] args){
    System.out.print("Enter the number of students: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    
    int best = 0;
    int[] scores = new int[num];
    System.out.print("Enter " + num + " scores: ");
    for (int i = 0; i < num; i++){
      scores[i] = input.nextInt();
      if (scores[i] > best)
        best = scores[i];  
    }  // for i
    
    char[] grades = new char[num];
    for (int i = 0; i < num; i++){  
      if (scores[i] >= best - 10)
        grades[i] = 'A';
      else if (scores[i] >= best - 20)
        grades[i] = 'B';
      else if (scores[i] >= best - 30)
        grades[i] = 'C';
      else if (scores[i] >= best - 40)
        grades[i] = 'D';
      else 
        grades[i] = 'F';
    } // for i
    
    for (int i = 0; i < num; i++){
      System.out.println("Student " + i + " score is " + scores[i] 
              + " and grade is " + grades[i]);
    }
  } // main   
} // class AssignGrades
