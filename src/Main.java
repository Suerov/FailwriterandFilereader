import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     writeMethod("Don't be so Shay","Imani");

        System.out.println(readMethod());

    }

    public static void writeMethod(String title, String author) throws IOException {
        FileWriter fileWriter = new FileWriter("Song.txt");
        fileWriter.write("\n"+" Название:"+title + "\n");
        fileWriter.write("Автор:"+author + "\n"+"\n");
        fileWriter.write("I'm right here, boss man\n" +
                "I got this here\n" +
                "Can't be touched, can't be stopped\n" +
                "Can't be moved, can't be rocked\n" +
                "Can't be shook, we hot\n" +
                "When will you niggas learn?\n" +
                "Came to get crunk, came to bring life\n" +
                "Came to get it started, came to get it right\n" +
                "Turn down the music, turn up my mic\n" +
                "When will you niggas learn?\n" +
                "I mean what I speak, I do as I say\n" +
                "I hustle, I grind, don't get in my way\n" +
                "I'm pimping my hoes, I'm jacking my foes\n" +
                "I spit at police and duck my POs\n" +
                "I ain't going to court, you can call the judge\n" +
                "Tell him kiss my ass, 'cause I ain't gonna budge\n" +
                "And I ain't going back to lock up\n" +
                "You try and the Glock'll pop up\n" +
                "I ain't going back to broke\n" +
                "And I'm never gonna stop the puffing, not for nothing\n" +
                "The block, they need me, the streets they need me\n" +
                "The club scene, nigga, is mine, believe me\n" +
                "You don't believe me?");
        fileWriter.close();
    }

    public static Song readMethod() throws IOException {
        FileReader fileReader = new FileReader("Song.txt");
        Scanner scanner = new Scanner(fileReader);
        Song song = new Song();
        StringBuilder stringBuilder = new StringBuilder();
        song.setTitle(song.getTitle());
        song.setAuthor(song.getAuthor());
        while (scanner.hasNextLine()) {
        stringBuilder.append(scanner.nextLine()+"\n");

    }
    song.setText(stringBuilder.toString());
        fileReader.close();



        return song;
    }
}