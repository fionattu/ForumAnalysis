import java.util.ArrayList;
import java.util.List;

/**
 * Created by fiona on 25/2/16.
 */
public class ForumContainer {
    public List<Post> forum;

    public ForumContainer(){
        forum = new ArrayList<>();
    }

    public void addPost(Post post){
        forum.add(post);
    }
}
