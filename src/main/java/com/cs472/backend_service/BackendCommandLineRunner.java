package com.cs472.backend_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BackendCommandLineRunner implements CommandLineRunner {

    private UserRepository userRepository;

    public BackendCommandLineRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (userRepository.count() == 0) {
            System.out.println("Init User.....");
            userRepository.saveAll(List.of(
                    new User("student1@university.edu", "AliceSmith", "123456", "Computer Science", UserType.STUDENT),
                    new User("john.doe@campus.edu", "JohnDoe2025", "password1", "Electrical Engineering", UserType.STUDENT),
                    new User("emily.w@school.edu", "EmilyW", "emily_pass", "Business Administration", UserType.STUDENT)
            ));

            userRepository.saveAll(List.of(
                    new User("cs_club@university.edu", "CSClub", "club2025", null, UserType.ORG),
                    new User("career.center@campus.edu", "CareerCenter", "career123", null, UserType.ORG),
                    new User("sports.team@school.edu", "SportsTeam", "team_pass", null, UserType.ORG)
            ));
        }
    }
}
