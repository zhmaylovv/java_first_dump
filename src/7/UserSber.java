package zhmaylo;

import java.util.*;
import java.util.stream.Collectors;

public class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    public UserSber(String username, String email) {
        this.username = username;
        this.email = email;
        this.passwordHash = username.getBytes();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public int hashCode() {
        return (getUsername().hashCode() + getEmail().hashCode() + Arrays.hashCode(getPasswordHash()));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        UserSber convertedObj = (UserSber) obj;
        return getUsername().equals(convertedObj.getUsername()) &&
                getEmail().equals(convertedObj.getEmail()) &&
                Arrays.equals(getPasswordHash(), convertedObj.getPasswordHash());
    }

    public static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        setA.retainAll(setB);
        return new ArrayList(setA);
    }

    public static List<UserSber> findDuplicatesFor(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        for (UserSber user : collA) {
            if (collB.contains(user)) {
                duplicates.add(user);
            }
        }
        return duplicates;
    }

    public static List<UserSber> findDuplicatesStream(Collection<UserSber> collA, Collection<UserSber> collB) {
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        return setA.stream().filter(setB::contains).collect(Collectors.toList());
    }
}
