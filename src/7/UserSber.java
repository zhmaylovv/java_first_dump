package zhmaylo;

import java.util.*;
import java.util.stream.Collectors;
/**
 * @class UserSber Класс пользователя.
 * @version 1.0
 * @autor Жмайло Василий
 */

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

    /**
     * Функция поиска дубликатов с использованием HashSet и встроенного метода
     * .retainAll()
     * @return возвращает ArrayList преобразуя в него set с пересечениями множеств
     */
    public static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        setA.retainAll(setB);
        return new ArrayList(setA);
    }

    /**
     * Функция поиска дубликатов с использованием ArrayList и цикла for
     * @return возвращает ArrayList.
     * время работы составляет несколько минут.
     */
    public static List<UserSber> findDuplicatesFor(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        for (UserSber user : collA) {
            if (collB.contains(user)) {
                duplicates.add(user);
            }
        }
        return duplicates;
    }

    /**
     * Функция поиска дубликатов с использованием HashSet и stream
     * @return возвращает List.
     */
    public static List<UserSber> findDuplicatesStream(Collection<UserSber> collA, Collection<UserSber> collB) {
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        return setA.stream().filter(setB::contains).collect(Collectors.toList());
    }
}
