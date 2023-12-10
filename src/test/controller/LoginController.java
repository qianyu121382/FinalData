package test.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.service.UseService;
import test.util.Result;

import java.io.UnsupportedEncodingException;


@Controller
@RequestMapping("login.do")
public class LoginController
{
    @Autowired()
    UseService useService;


    @RequestMapping()
    public String logining() throws UnsupportedEncodingException
    {
        Result result=useService.query();
        System.out.println(result.getMessage());
        return "1";
    }



}
