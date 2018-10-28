package cn.incast.controller;

import cn.incast.domain.User;

/**
 * @author abo
 * @title UserController
 * @ProjectName git01
 * @Description User控制层
 * @CreateDate 2018/10/28-18:08
 */
public class UserController {
    public static void main(String[] args) {

        User user = new User();
        user.setName("王小二");
        user.setAge(28);
        System.out.println(user);
    }
}
