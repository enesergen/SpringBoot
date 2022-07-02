package com.enesergen.springCourse.core.utilities.dataAccess;

import com.enesergen.springCourse.core.utilities.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDal extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
