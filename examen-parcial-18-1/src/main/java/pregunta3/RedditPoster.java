package pregunta3;

public class RedditPoster implements Sharing {
    @Override
    public void share(String message) {
        System.out.println("Message '" + message + "' shared on Twitter");
    }
}
