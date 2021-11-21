package adapter.java.app;

import java.util.HashMap;
import java.util.Map;

import adapter.java.app.api.UserResources;

public class Program {
    public static void main(String[] args) {

        UserResources userRestApi = new UserResources();
        Map<String, String> body = new HashMap<String, String>();
        body.put("email", "user1@email.com");
        body.put("name", "User 1");
        body.put("password", "passwd");
        Integer statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);

        body.put("email", "user2@email.com");
        body.put("name", "User 2");
        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);

        body.put("email", "user2@email.com");
        body.put("name", "User 2");
        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);
    }
}
