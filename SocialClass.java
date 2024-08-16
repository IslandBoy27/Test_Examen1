import java.util.ArrayList;

public abstract class SocialClass {
    protected ArrayList<String> friends;
    protected ArrayList<String> posts;
    protected String username;

    // Constructor
    public SocialClass(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    // Método para agregar un amigo
    public boolean addFriend(String user) {
        if (!friends.contains(user) && !user.equals(username)) {
            friends.add(user);
            return true;
        }
        return false;
    }

    // Método para agregar un post
    public void addPost(String msg) {
        posts.add(msg);
    }

    // Método abstracto timeline
    public abstract void timeline();

    // Método para imprimir el perfil
    public void myProfile() {
        System.out.println("Username: " + username);
        timeline();
        System.out.println("Friends:");
        for (int i = 0; i < friends.size(); i++) {
            System.out.print(friends.get(i) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

}
