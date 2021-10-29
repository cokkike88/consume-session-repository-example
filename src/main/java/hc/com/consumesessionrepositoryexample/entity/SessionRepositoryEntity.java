package hc.com.consumesessionrepositoryexample.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Map;

@Getter
@Setter
public class SessionRepositoryEntity {
    private String sessionId;
    private Map<String, String> sessionData;
    private Calendar expirationDate;
    private Long version;
}
