package service.oauth2.pk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import service.oauth2.pk.entity.UserEntity;
import service.oauth2.pk.repository.UserRepository;
import service.oauth2.pk.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserEntity user = userRepository.findByUserName(userName);
        if (user == null)
            throw new BadCredentialsException("Bad credentials");
        new AccountStatusUserDetailsChecker().check(user);
        return user;
    }
}
