import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private String artist;
    private List<String> listeners;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.listeners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> newListeners){
        int listenerCount = 0;
        for(String listeners : newListeners){
            String listenerName = listeners.toLowerCase();
                if(!(this.listeners.contains(listenerName))){
                    this.listeners.add(listenerName);
                    listenerCount++;
            }
        }
        return listenerCount;
    }
}