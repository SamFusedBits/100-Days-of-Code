package src;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class musicStreamingService {

    public static class MusicStreamingService {
        private Map<String, Set<String>> playlists; // Map to store playlists and their corresponding set of songs
        private Set<String> allSongs; // Set to store all available songs in the streaming service

        public MusicStreamingService() {
            playlists = new HashMap<>();
            allSongs = new HashSet<>();
        }

        public void createPlaylist(String playlistName) {
            playlists.put(playlistName, new HashSet<>()); // Create an empty set of songs for the playlist
        }

        public void addSongToPlaylist(String playlistName, String song) {
            if (playlists.containsKey(playlistName)) {
                playlists.get(playlistName).add(song); // Add the song to the playlist
                allSongs.add(song); // Add the song to the set of all songs
                System.out.println("Added song '" + song + "' to playlist '" + playlistName + "'.");
            } else {
                System.out.println("Playlist '" + playlistName + "' does not exist.");
            }
        }

        public void removeSongFromPlaylist(String playlistName, String song) {
            if (playlists.containsKey(playlistName)) {
                if (playlists.get(playlistName).contains(song)) {
                    playlists.get(playlistName).remove(song); // Remove the song from the playlist
                    System.out.println("Removed song '" + song + "' from playlist '" + playlistName + "'.");
                } else {
                    System.out.println("Song '" + song + "' is not in playlist '" + playlistName + "'.");
                }
            } else {
                System.out.println("Playlist '" + playlistName + "' does not exist.");
            }
        }

        public void displayPlaylists() {
            System.out.println("Playlists:");
            for (String playlistName : playlists.keySet()) {
                System.out.println("- " + playlistName + ": " + playlists.get(playlistName));
            }
        }

        public void displayAllSongs() {
            System.out.println("All Songs:");
            for (String song : allSongs) {
                System.out.println("- " + song);
            }
        }

        public static void main(String[] args) {
            MusicStreamingService musicService = new MusicStreamingService();

            // Create playlists
            musicService.createPlaylist("Favorites");
            musicService.createPlaylist("Workout");

            // Add songs to playlists
            musicService.addSongToPlaylist("Favorites", "Shape of You");
            musicService.addSongToPlaylist("Favorites", "Despacito");
            musicService.addSongToPlaylist("Workout", "Brothers Anthem");

            // Display playlists and available songs
            musicService.displayPlaylists();
            musicService.displayAllSongs();

            // Remove a song from a playlist
            musicService.removeSongFromPlaylist("Favorites", "Despacito");
            musicService.displayPlaylists();
        }
    }
}
