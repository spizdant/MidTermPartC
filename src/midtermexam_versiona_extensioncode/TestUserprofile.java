/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Dante Spizzirri
 * 10/21/2026
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String userId;
        String genre;
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        System.out.print("What is your name? ");
        userId = input.nextLine();
        
        System.out.println("What is your favourite genre amongst the following:");
        for (int i = 0; i < genres.length; i++){
            System.out.printf(genres[i] + ", ");
        }
        genre = input.nextLine();
        
        UserProfile user = new UserProfile(userId, genre);
        System.out.println(user.getUserID());
        System.out.println(user.getGenre());
            
    }
}
