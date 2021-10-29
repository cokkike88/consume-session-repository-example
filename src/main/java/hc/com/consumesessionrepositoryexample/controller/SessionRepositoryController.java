package hc.com.consumesessionrepositoryexample.controller;

import hc.com.consumesessionrepositoryexample.entity.SessionRepositoryEntity;
import hc.com.consumesessionrepositoryexample.repository.SessionRepositoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sessions")
public class SessionRepositoryController {

    private final SessionRepositoryRepository sessionRepositoryRepository;

    public SessionRepositoryController(SessionRepositoryRepository sessionRepositoryRepository){
        this.sessionRepositoryRepository = sessionRepositoryRepository;
    }


    @GetMapping(value = "/{sessionId}")
    public SessionRepositoryEntity getSession(@PathVariable("sessionId") String sessionId){
        try{
            return sessionRepositoryRepository.getSession(sessionId);
        }
        catch (Exception ex){
            System.out.println("Error to consume sesssion-repository " + ex.getMessage());
        }
        return null;
    }




}
