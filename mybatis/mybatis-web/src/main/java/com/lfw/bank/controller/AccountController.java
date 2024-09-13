package com.lfw.bank.controller;

import com.lfw.bank.exception.AppException;
import com.lfw.bank.exception.MoneyNotEnoughException;
import com.lfw.bank.service.AccountService;
import com.lfw.bank.service.impl.AccountServiceImpl;
import com.lfw.bank.service.impl.AccountServiceImpl2;
import com.lfw.bank.service.impl.AccountServiceImpl3;
import com.lfw.bank.service.impl.AccountServiceImpl4;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 账户控制器
 */
@WebServlet("/transfer")
public class AccountController extends HttpServlet {
    // 转账成功案例
//    private AccountService accountService = new AccountServiceImpl();

    // 转账失败案例
//    private AccountService accountService = new AccountServiceImpl2();

    // 事务改造
//    private AccountService accountService = new AccountServiceImpl3();

    // 动态生成
    private AccountService accountService = new AccountServiceImpl4();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取响应流
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 获取账户信息
        String fromActno = request.getParameter("fromActno");
        String toActno = request.getParameter("toActno");
        double money = Integer.parseInt(request.getParameter("money"));
        // 调用业务方法完成转账
        try {
            accountService.transfer(fromActno, toActno, money);
            out.print("<h1>转账成功！！！</h1>");
        } catch (MoneyNotEnoughException e) {
            out.print(e.getMessage());
        } catch (AppException e) {
            out.print(e.getMessage());
        }
    }
}
