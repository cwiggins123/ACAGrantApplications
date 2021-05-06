package com.company.proj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//for this application the "Grant" class is actually the grant applications, shortened to "Grant" for simplicity's sake. The grants themselves are not included in the database.
//the "User" class is for the artists that have submitted grant applications
// "PanelMember" is for the panel judges that are scoring each grant application

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner init(UserRepository userRepository, PanelMemberRepository panelMemberRepository, GrantRepository grantRepository) {
        return args -> {
            User John = new User("John", "Doe","800-867-5309", "100 Acme st.", "12345");
            Grant grant = new Grant("12345", 25,25,25,25,"1");
            userRepository.save(John);
            userRepository.save(new User("Sally", "Doe", "800-867-5309", "100 Acme st.", "12326"));
            userRepository.save(new User("Jane", "Doe", "800-867-5345", "110 Acme st.", "12324"));
            panelMemberRepository.save(new PanelMember('1'));
            panelMemberRepository.save(new PanelMember('2'));
            panelMemberRepository.save(new PanelMember('3'));
            grantRepository.save(grant);
            grantRepository.save(new Grant("12326", 20,19,23,15,"2"));
            grantRepository.save(new Grant("12324", 14,16,17,24,"3"));
            grantRepository.save(new GrantsWithUsers(grant, John));

            userRepository.findAll().forEach(System.out::println);
            panelMemberRepository.findAll().forEach(System.out::println);
            grantRepository.findAll().forEach(System.out::println);
        };
    }
}
