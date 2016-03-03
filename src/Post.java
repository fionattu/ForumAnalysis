/**
 * Created by fiona on 25/2/16.
 */
public class Post {
    String recordType;
    String postTime;
//    String content;
    String posterId;
    int forumId;
    int threadId;
    int postId;

    public Post(String recordType, String postTime, String posterId, int forumId, int threadId, int postId, int commentId) {
        this.recordType = recordType;
        this.postTime = postTime;
        this.posterId = posterId;
        this.forumId = forumId;
        this.threadId = threadId;
        this.postId = postId;
        this.commentId = commentId;
    }

    int commentId;

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

//    public String getContent() {
//        return content;
//    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    public String getPosterId() {
        return posterId;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }


}
