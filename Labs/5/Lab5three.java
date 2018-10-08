import java.util.Scanner;

class Lab5three {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students ");
        
        int  numOfStudents;
        numOfStudents = input.nextInt();

        int[] student = new int [numOfStudents];
        String[] name = new String[numOfStudents];
        int[] score = new int [numOfStudents];

        for (int i = 0; i < student.length; i++)
        {
            System.out.print("Enter player's name ");
            name[i] = input.next(); 
        }

        for (int i = 0; i < student.length; i++)
        {
        System.out.print("Enter student's score ");
        score[i] = input.nextInt();

        }

        for (int i = 0; i < numOfStudents; i++)
        {
            System.out.println(name [i] + " " + score [i]);

        }
    }

	// JA: You have to sort both lists simultaneously
    public static void sortScore(int[] list)
    {
        for (int i = 0; i < list.length - 1; i++) 
        {
            int scoreMin = list[i];
            int minIndex = i; 


            for (int j = i + 1; j < list.length; j++) 
            {
                if (scoreMin > list[j])  {
                    scoreMin = list[j];
                    minIndex = j;
                }
            }
            
            if (minIndex != i)
            {
                list[minIndex] = list[i];
                list[i] = scoreMin;
            }
        }

    }
}