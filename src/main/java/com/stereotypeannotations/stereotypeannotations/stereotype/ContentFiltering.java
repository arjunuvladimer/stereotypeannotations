package com.stereotypeannotations.stereotypeannotations.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentFiltering implements Filter {
    @Autowired
    private Movie movie;

    public ContentFiltering(){
        super();
    }

    public String[] getRecommendations(String movie){
        return new String[] {"MI1", "MI2", "MI3"};
    }
}

// @Component
// 1. @Repository => Data Access Layer
// 2. @Service => Service Layer
// 3. @Controller => Web Layer