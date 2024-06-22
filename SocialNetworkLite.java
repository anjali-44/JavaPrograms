import java.util.*;

public class SocialNetworkLite {
    private Map<String, User> users;

    public SocialNetworkLite() {
        users = new HashMap<>();
    }

    public void addUser(String name, String bio) {
        if (!users.containsKey(name)) {
            users.put(name, new User(name, bio));
        } else {
            System.out.println("User with this name already exists.");
        }
    }

    public void addFriendship(String name1, String name2) {
        User user1 = users.get(name1);
        User user2 = users.get(name2);

        if (user1 != null && user2 != null) {
            user1.addFriend(user2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void displayUser(String name) {
        User user = users.get(name);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("User not found");
        }
    }

    public List<String> getFeedDFS(String name) {
        User user = users.get(name);
        List<String> feed = new ArrayList<>();
        if (user != null) {
            Set<User> visited = new HashSet<>();
            Stack<User> stack = new Stack<>();
            stack.push(user);
            while (!stack.isEmpty()) {
                User current = stack.pop();
                if (!visited.contains(current)) {
                    feed.add(current.getName());
                    visited.add(current);
                    for (User friend : current.getFriends()) {
                        stack.push(friend);
                    }
                }
            }
        }
        return feed;
    }

    public List<String> getFeedBFS(String name) {
        User user = users.get(name);
        List<String> feed = new ArrayList<>();
        if (user != null) {
            Set<User> visited = new HashSet<>();
            Queue<User> queue = new LinkedList<>();
            queue.add(user);
            while (!queue.isEmpty()) {
                User current = queue.poll();
                if (!visited.contains(current)) {
                    feed.add(current.getName());
                    visited.add(current);
                    for (User friend : current.getFriends()) {
                        queue.add(friend);
                    }
                }
            }
        }
        return feed;
    }

    public static void main(String[] args) {
        SocialNetworkLite sn = new SocialNetworkLite();

        // Add users
        sn.addUser("Alice", "Bio of Alice");
        sn.addUser("Bob", "Bio of Bob");
        sn.addUser("Charlie", "Bio of Charlie");
        sn.addUser("Daisy", "Bio of Daisy");

        // Add friendships
        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");
        sn.addFriendship("Bob", "Daisy");

        // Display user information
        sn.displayUser("Alice");

        // Generate and display feed
        System.out.println("DFS Feed for Alice: " + sn.getFeedDFS("Alice"));
        System.out.println("BFS Feed for Alice: " + sn.getFeedBFS("Alice"));
    }
}
