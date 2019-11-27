import java.util.HashMap;
import java.util.Set;
public class HashMatique{
    public HashMap<String,String> trackList(){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("song1", "kjdjdjj");
        tracklist.put("song2", "hello this is me");
        tracklist.put("song3", "Here I am");
        tracklist.put("song4", "Its a beautiful day");
        Set<String> keys = tracklist.keySet();
        System.out.println(tracklist.get("song2"));
        for(String key: keys ){
            System.out.println(key  + ":" + tracklist.get(key));

            
        }
        return tracklist;
    }
    public static void main(String[] args) {
        HashMatique obj = new HashMatique();
        System.out.println(obj.trackList());
    }
}