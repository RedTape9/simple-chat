package io.github.redtape9.simplechat.user;

import io.github.redtape9.simplechat.user.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
