import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> songs = new ArrayList<>();

        for (int i = 0; i< 3;i++){
            System.out.print("Enter a music artist: ");
            String artist = sc.nextLine();

            System.out.print("Enter a song title: ");
            String title = sc.nextLine();

            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s.getTitle());
        }

        //print all the songs in the array list
        for(String s: songs){
            System.out.println(s);
        }


        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (String s: songs){
            if (s.equalsIgnoreCase(titleToFind)){
                System.out.printf("I found %s \r\n",s);
            }
        }

    }
}