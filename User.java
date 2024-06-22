import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String bio;
    private List<User> friends;

    public User(String name, String bio) {
        this.name = name;
        this.bio = bio;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            user.getFriends().add(this); // Add mutual friendship
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Bio: " + bio;
    }
}
