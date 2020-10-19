package com.visasplit.visasplitbackend.repository;

import com.visasplit.visasplitbackend.models.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group,Integer> {


}
