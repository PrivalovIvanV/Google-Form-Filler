package code;

public class Response {
    Questions type;
    String value;

    public Response(Questions type, String value) {
        this.type = type;
        this.value = value;
    }

    public Questions getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
