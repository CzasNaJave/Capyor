package com.czasnajave.capyor.controller;



import com.czasnajave.capyor.beans.Image;
import com.czasnajave.capyor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/image")
@Controller
public class ImageController {


    @Autowired
    private ImageService imageService;


    @RequestMapping(value = "/addImage", method = RequestMethod.POST)
    public @ResponseBody void addImage(@RequestBody Image image) {imageService.addImage(image); }

    @RequestMapping(value = "/{image}")
    public String redirect() {
        return "image/layout";
    }








}
