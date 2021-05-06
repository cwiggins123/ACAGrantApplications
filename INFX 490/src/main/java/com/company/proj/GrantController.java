package com.company.proj;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GrantController {

    private final GrantRepository grantRepository;
    private final UserRepository userRepository;

    public GrantController(GrantRepository grantrepository, UserRepository userRepository){
        this.grantRepository = grantrepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/grants")
    public List<Grant> getUsers() {
        return (List<Grant>) grantRepository.findAll();
    }

    @GetMapping("/grantsUsers")
    public List<GrantsWithUsers> getGrantsUsers() {
        List<GrantsWithUsers> allGrants = new ArrayList<>();
        List<Grant> grants = (List<Grant>) grantRepository.findAll();
        if (grants != null) {
            for (Grant grant : grants) {
                User user = userRepository.getByGrantID(grant.grantID);
                if (user != null) {
                    GrantsWithUsers grantsWithUsers = new GrantsWithUsers(grant, user);
                    allGrants.add(grantsWithUsers);
                }
            }
        }
        return allGrants;
    }

    @PostMapping("/grants")
    void addUser(@RequestBody Grant grant) {
        grantRepository.save(grant);
    }
}
