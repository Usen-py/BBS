package com.blog.common;


public interface Perms {
    int READ = 1<<0;

    int COMMENT = 1<<1;

    int WRITE = 1<<2;

    int DOWNLOAD= 1<<3;

    int CREATE = 1<<4;

    int ADMIN = 1<<5;

    int ALL = READ | WRITE | COMMENT | DOWNLOAD | CREATE | ADMIN;
}
