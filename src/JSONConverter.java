import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

/**
 * Created by fiona on 25/2/16.
 */
public class JSONConverter {
    public static void main(String args[]){
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("/Users/fiona/Desktop/dy/stschina1/stschina1.txt"));
            JSONArray jsonArray =  (JSONArray) obj;
            JSONObject jsonObject;
            ForumContainer forumContainer = new ForumContainer();
            for (int i = 0 ; i < jsonArray.size(); i++ ){
                jsonObject = (JSONObject) jsonArray.get(i);
                String recordType = jsonObject.get("type").toString();
                String postTime = jsonObject.get("post_time") != null && jsonObject.get("post_time").toString().length() == 10? convertToDate(jsonObject.get("post_time").toString()):"" ;
                String posterId = jsonObject.get("forum_user_id") != null? jsonObject.get("forum_user_id").toString():"";
                int forumId = Integer.parseInt(jsonObject.get("forum_id").toString());
                int threadId = Integer.parseInt(jsonObject.get("thread_id").toString());
                int postId = Integer.parseInt(jsonObject.get("post_id").toString());
                int commentId = Integer.parseInt(jsonObject.get("comment_id").toString());
                Post post = new Post(recordType, postTime, posterId, forumId, threadId, postId, commentId);
                forumContainer.addPost(post);
            }
            Gson gson = new GsonBuilder().create();
            String jsonStr = gson.toJson(forumContainer);
            System.out.println("jsonStr: " + jsonStr);
            System.out.println("hello");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String convertToDate(String postTime){
        long seconds = Long.parseLong(postTime) * 1000;
        return seconds+ "";
    }

}
