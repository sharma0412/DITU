package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import com.jtspringproject.JtSpringProject.services.productService;
import com.jtspringproject.JtSpringProject.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Controller
public class FormFieldController {

    @Autowired
    private userService userService;

    @Autowired
    private productService productService;

    @GetMapping("/register")
    public String registerUser() {
        return "register";
    }

    @GetMapping("/buy")
    public String buy() {
        return "buy";
    }


    @GetMapping("/")
    public String userlogin(Model model) {
        return "userLogin";
    }

    @RequestMapping(value = "userloginvalidate", method = RequestMethod.POST)
    public ModelAndView userlogin(@RequestParam("username") String username, @RequestParam("password") String pass, Model model, HttpServletResponse res) {

        System.out.println(pass);
        User u = this.userService.checkLogin(username, pass);
        System.out.println(u.getUsername());
        if (u.getUsername().equals(username)) {

            res.addCookie(new Cookie("username", u.getUsername()));
            ModelAndView mView = new ModelAndView("index");
            mView.addObject("user", u);
            List<Product> products = this.productService.getProducts();

            if (products.isEmpty()) {
                mView.addObject("msg", "No products are available");
            } else {
                mView.addObject("products", products);
            }
            return mView;

        } else {
            ModelAndView mView = new ModelAndView("userLogin");
            mView.addObject("msg", "Please enter correct email and password");
            return mView;
        }

    }


    @GetMapping("/user/products")
    public ModelAndView getproduct() {

        ModelAndView mView = new ModelAndView("uproduct");

        List<Product> products = this.productService.getProducts();

        if (products.isEmpty()) {
            mView.addObject("msg", "No products are available");
        } else {
            mView.addObject("products", products);
        }

        return mView;
    }

    @RequestMapping(value = "newuserregister", method = RequestMethod.POST)
    public String newUseRegister(@ModelAttribute User user) {

        System.out.println(user.getEmail());
        user.setRole("ROLE_NORMAL");
        this.userService.addUser(user);

        return "redirect:/";
    }

    @GetMapping("/test")
    public String Test(Model model) {
        System.out.println("test page");
        model.addAttribute("author", "jay gajera");
        model.addAttribute("id", 40);

        List<String> friends = new ArrayList<String>();
        model.addAttribute("f", friends);
        friends.add("xyz");
        friends.add("abc");

        return "test";
    }

//    @GetMapping("/test2")
//    public ModelAndView Test2() {
//        System.out.println("test page");
//        //create modelandview object
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", "jay gajera 17");
//        mv.addObject("id", 40);
//        mv.setViewName("test2");
//
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(25);
//        mv.addObject("marks", list);
//        return mv;
//    }
}
