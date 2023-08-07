package jhlee.class4.app.dto.request;

import jhlee.class4.app.entity.Friends;

import java.util.List;

public record RequestDTO(
        String user,
        List<Friends> friends,
        List<String> visitors
) {

}
