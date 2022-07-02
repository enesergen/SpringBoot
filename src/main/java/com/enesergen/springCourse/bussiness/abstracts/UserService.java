package com.enesergen.springCourse.bussiness.abstracts;

import com.enesergen.springCourse.core.utilities.entities.User;
import com.enesergen.springCourse.core.utilities.results.DataResult;
import com.enesergen.springCourse.core.utilities.results.Result;
import org.springframework.stereotype.Repository;

public interface UserService {
    Result add(User user);
    DataResult<User>findByEmail(String email);
}
