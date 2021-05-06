package com.company.proj;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelMemberRepository extends CrudRepository <PanelMember, Long> {}
