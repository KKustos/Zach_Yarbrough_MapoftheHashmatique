    
import java.util.HashMap;

public class TrackList {
    public void trackList(){
        HashMap<String, String> tracks = new HashMap<>();
        tracks.put("No World for Tomorrow", "Wait! There's never been a mess like this");
        tracks.put("Feathers", "History's made its mark in anger");
        tracks.put("The Running Free", "All non-believers stand aside and fear");
        tracks.put("The Fall of House Atlantic","In our days we've mourned insignias");
        System.out.println("The lyrics to Feathers include: "+tracks.get("Feathers"));
        tracks.forEach((k,v) -> System.out.println(k+": "+v));
    }
}