package bean_scopes_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService{

    @Autowired
    public CacheManager cacheManager;

    public CacheManager getCacheManager(){
        return cacheManager;
    }
}
