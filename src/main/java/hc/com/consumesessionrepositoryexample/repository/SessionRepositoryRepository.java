package hc.com.consumesessionrepositoryexample.repository;

import hc.com.consumesessionrepositoryexample.entity.SessionRepositoryEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "session-repository", url = "${session-repository-url}")
public interface SessionRepositoryRepository {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/v1/sessions/{sessionId}"
    )
    SessionRepositoryEntity getSession(@PathVariable("sessionId") String sessionId);
}
