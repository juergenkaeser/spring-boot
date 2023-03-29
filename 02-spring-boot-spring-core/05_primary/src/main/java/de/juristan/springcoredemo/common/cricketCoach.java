package de.juristan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 10 minutes";
    }
}
