package com.nirmal.blog.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nirmal.blog.model.User;

/**
 * 
 * @author muthu_m
 *
 */
public interface UserService extends UserDetailsService
{
    User findByEmail(String email);

    User findByUsername(String username);

    boolean emailExists(String email);

    boolean usernameExists(String username);

    void register(User user);

    void changeEmail(String newEmail, String currentPassword) throws AuthException;

    void changePassword(String newPassword, String currentPassword) throws AuthException;

    void changeProfileInfo(User newProfileInfo);

    void changeAvatar(UploadedAvatarInfo uploadedAvatarInfo);

    void removeAvatar();

    void authenticate(User user);

    boolean isAuthenticated();

    boolean isAdmin();

    User currentUser();

}

