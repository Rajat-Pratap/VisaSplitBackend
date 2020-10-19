package com.visasplit.visasplitbackend.controllers;

import com.visasplit.visasplitbackend.models.Group;
import com.visasplit.visasplitbackend.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupController {

    @Autowired
    private GroupRepository repository;

    @PostMapping("/api/addGroup")
    public Boolean addGroup(@RequestBody Group group) {
        repository.save(group);
        return true;
    }

    @GetMapping("/api/group{groupId}")
    public Optional<Group> getGroup(@PathVariable int groupId){
        return repository.findById(groupId);
    }

    @GetMapping("/api/getUserGroups{userId}")
    public List<Group> getUserGroups(@PathVariable int userId){
        return repository.findAll();
    }

}
