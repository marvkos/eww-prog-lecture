package at.technikum.simpleclasses.musicplayer;

public class MusicPlayer {

    public static void main(String[] args) {
        Song track1 = new Song(
                "TTSG",
                "AB",
                "Pop",
                400
        );
        Song track2 = new Song(
                "TTSG",
                "AB",
                "Pop",
                400
        );
        Song track3 = new Song(
                "TTSG",
                "AB",
                "Pop",
                400
        );
        Playlist p1 = new Playlist(
                "Party Mix",
                5
        );
        p1.addSong(track1);
        p1.addSong(track2);
        p1.addSong(track3);

        System.out.printf(
                "Total Runtime in Seconds: %d",
                p1.getTotalRuntime()
        );
    }
}
