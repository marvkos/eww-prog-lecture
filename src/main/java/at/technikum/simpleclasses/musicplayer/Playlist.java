package at.technikum.simpleclasses.musicplayer;

public class Playlist {

    private String title;

    private Song[] songs;

    private int songCount;

    public Playlist(String title, int maxSongs) {
        // TODO
        this.title = title;
        this.songs = new Song[maxSongs];
        this.songCount = 0;
    }

    public void addSong(Song song) {
        // TODO: Add a song to the playlist
        if (songCount == songs.length) {
            System.out.println("Playlist full");
            return;
        }

        songs[songCount] = song;
        songCount++;
    }

    public void removeSong(Song song) {
        // TODO
    }

    public int getTotalRuntime() {
        // TODO: return total runtime of all song
        int totalRuntime = 0;
        for (int i = 0; i < songCount; i++) {
            Song song = songs[i];
            totalRuntime += song.getLength();
            // totalRuntime += songs[i].getLength();
        }

        return totalRuntime;
    }

    public int getUniqueArtist() {
        // TODO
        return 0;
    }



    // TODO: Getter Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public int getSongCount() {
        return songCount;
    }
}
