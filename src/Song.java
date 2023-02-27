import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners;

    public Song(String t, String a)
    {
        title = t;
        artist = a;
        listeners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int howMany(ArrayList<String> arr)
    {
        int count = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            if(!listeners.contains(arr.get(i).toLowerCase())) {
                listeners.add(arr.get(i).toLowerCase());
                count++;
            }
        }
        return count;
    }

}
