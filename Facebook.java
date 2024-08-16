import java.util.ArrayList;

public class Facebook extends SocialClass implements Commentable {
    private ArrayList<Comment> comments;

    // Constructor
    public Facebook(String username) {
        super(username);
        this.comments = new ArrayList<>();
    }

    // Método para agregar un comentario
    @Override
    public boolean addComment(Comment comment) {
        int postId = comment.getPostId();
        if (postId >= 0 && postId < posts.size()) {
            comments.add(comment);
            return true;
        }
        return false;
    }

    // Método para mostrar el timeline
    @Override
    public void timeline() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println("POST " + (i + 1) + ": " + posts.get(i));
            for (Comment comment : comments) {
                if (comment.getPostId() == i) {
                    comment.print();
                }
            }
        }
    }
}
