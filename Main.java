package com.journey.game;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String name;
        int play_game;
        int left_right = 0;
       int hide_ign = 0;
       int help_run = 0;
       int open_back = 0;
        System.out.println("What is your name?");
        name = scanner.nextLine();
       
        System.out.println("Hi "+ name);
       
       
        System.out.println("Would you like to go on an adventure? Press 1 for yes and 2 for no");
        play_game = scanner.nextInt();
       
        if(play_game == 1){
            System.out.println("You sure are very brave. What are we waiting for then. We can start our journey...");
           }
        else if(play_game ==2 ){
             System.out.println("SCAREDY CAT. RUN THE GAME AGAIN AND CLICK 1");
               }
        while(play_game != 1 && play_game!= 2){
            System.out.println("Please type 1 for yes or 2 for no.");
            play_game = scanner.nextInt();
            if(play_game == 1){
                System.out.println("You sure are very brave. What are we waiting for then. We can start our journey...");
            }
            else if(play_game ==2 ){
                System.out.println("SCAREDY CAT. RUN THE GAME AGAIN AND CLICK 1");
            }
        }
        if(play_game == 1){
        System.out.println("You see two paths. One says left and the other says right. Which one will you pick. Type 3 for right and 4 for left");
            left_right = scanner.nextInt();
        }if(left_right == 4){
            System.out.println("Great Choice! You are covered in fog and can't see very clearly.You see someone walking by. If you would like to ask them for help to clear this challenge press 7 or if you want to make a blind run for it press 8.");
            help_run = scanner.nextInt();
        }
            else if(left_right == 3){
                System.out.println("Great Choice! Wait, you feel like someone is following you. Press 5 to hide or press 6 to ignore.");
                hide_ign = scanner.nextInt();
            }
           
            while(left_right != 4 && play_game != 2 && left_right != 3)
{
            System.out.println("Please type 3 for yes or 4 for no.");
            left_right = scanner.nextInt();
            if(left_right == 3)
{
                System.out.println("Great Choice! Wait, you feel like someone is following you. Press 5 to hide or press 6 to ignore.");
                    hide_ign = scanner.nextInt();
            }
            else if(left_right ==4 )
{
                  System.out.println("Great Choice! You are covered in fog and can't see very clearly. You see someone walking by. If you would like to ask them for help to clear this challenge press 7 or if you want to make a blind run for it press 8.");

                  help_run = scanner.nextInt();
               
            }
           
         }
         if(hide_ign == 5){
                System.out.println("You have successfully escaped the mysterious stranger.");
                }else if(hide_ign == 6){
                    System.out.println("The stranger takes out a knife and stabs you to death. YOU HAVE DIED LOL");
                }
         
         while(left_right != 4 && hide_ign != 5 && hide_ign != 6 && play_game != 2){
            System.out.println("Please type 5 to hide or 6 to ignore");
            hide_ign = scanner.nextInt();
            if(hide_ign == 6){
                System.out.println("The stranger takes out a knife and stabs you to death. YOU HAVE DIED LOL");
               
                   
            }
            else if(hide_ign ==5 ){
                 System.out.println("You have successfully escaped the mysterious stranger");
                 
            }      
           
         }
         
       if(help_run == 7){
           System.out.println("The man gives you special potion that enhances your eyesight");
       }
       else if(help_run == 8){
           System.out.println("You keep running in circles and go into depression and eventually DIE.");
       
       }
       while(help_run != 7 && help_run != 8 && hide_ign != 5 && hide_ign != 6 && play_game != 2 ){
           System.out.println("Please press 7 for help or press 8 to run");
                        help_run = scanner.nextInt();
                       if(help_run == 7){
                System.out.println("The man gives you special potion that enhances your eyesight.");
               
                   
            }
            else if(help_run == 8 ){
                 System.out.println("You keep running in circles and go into depression and eventually DIE.");
                 
            }  
       }
       if(help_run == 7)
       {
            System.out.println("You find your way out of this forest. You find a huge chest waiting for you at the end of the forest. Press 9 to open it or press 10 to go back home");
                open_back = scanner.nextInt();
               
       }else if(hide_ign == 5){
             System.out.println("You find your way out of this town. You find a huge chest waiting for you at the end of the forest. Press 9 to open it or press 10 to go back home");
                    open_back = scanner.nextInt();
                             }
        if(open_back == 9 ){
            System.out.println("You find a lot of gold. You live a happy life. You finished the game.");
    }
            else if(open_back == 10){
                System.out.println("You go back home. You don't have money to live. You die little by little every day. But Congratulations on making it this far.");
               
            }
            while(open_back != 9 && open_back != 10 && play_game != 2 && hide_ign != 6 && help_run != 8)
            {
                System.out.println("Please type 9 to open the chest or type 10 to go home");
                open_back = scanner.nextInt();
               
               
                if(open_back == 9 ){
            System.out.println("You find a lot of gold. You live a happy life. You finished the game.");
                                   }
            else if(open_back == 10){
                System.out.println("You go back home. You don't have money to live. You die little by little every day. But Congratulations on making it this far.");
                                    }
           
            }
               
    }
}

