package com.example.springcachekafka.dao;

import com.example.springcachekafka.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MemberRestRepository extends CrudRepository<Member, Long> {

}
