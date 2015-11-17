package io.github.karolkalinski;

public class ClientId {
    private int id;

    public ClientId(int id) {
        this.id = id;
    }

    public static ClientId fromInt(int id) {
        return new ClientId(id);
    }

    @Override
    public String toString() {
        return "ClientId{" +
                "id=" + id +
                '}';
    }
}
