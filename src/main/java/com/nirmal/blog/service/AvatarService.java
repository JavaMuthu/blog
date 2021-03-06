package com.nirmal.blog.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 
 * @author muthu_m
 *
 */
public interface AvatarService 
{

    UploadedAvatarInfo upload(MultipartFile file) throws IOException, UnsupportedFormatException;
}
