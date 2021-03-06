package com.nirmal.blog.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author muthu_m
 *
 */
@Service("fileNameGenerator")
public class FileNameGeneratorImpl implements FileNameGenerator 
{
    @Override
    public String getFileName(String filename, String prefix)
    {
        return prefix + filename.hashCode() + System.currentTimeMillis();
    }
}
