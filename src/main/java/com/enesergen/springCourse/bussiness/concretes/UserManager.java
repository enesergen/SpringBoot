package com.enesergen.springCourse.bussiness.concretes;

import com.enesergen.springCourse.bussiness.abstracts.UserService;
import com.enesergen.springCourse.core.utilities.dataAccess.UserDal;
import com.enesergen.springCourse.core.utilities.entities.User;
import com.enesergen.springCourse.core.utilities.results.DataResult;
import com.enesergen.springCourse.core.utilities.results.Result;
import com.enesergen.springCourse.core.utilities.results.SuccessDataResult;
import com.enesergen.springCourse.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDal userDal;

    @Autowired
    public UserManager(UserDal userDal) {
        this.userDal = userDal;
    }


    @Override
    public Result add(User user) {
        this.userDal.save(user);
        return new SuccessResult("User was added.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {

        return new SuccessDataResult<User>
                (this.userDal.findByEmail(email),"success");
    }
}
