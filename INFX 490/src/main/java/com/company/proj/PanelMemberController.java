package com.company.proj;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PanelMemberController {

    // standard constructors
    private final PanelMemberRepository panelmemberRepository;

    public PanelMemberController(PanelMemberRepository panelmemberrepository){
        this.panelmemberRepository = panelmemberrepository;
    }

    @GetMapping("/panelmembers")
    public List<PanelMember> getUsers() {
        return (List<PanelMember>) panelmemberRepository.findAll();
    }

    @PostMapping("/panelmembers")
    void addUser(@RequestBody PanelMember panelmember) {
        panelmemberRepository.save(panelmember);
    }
}
