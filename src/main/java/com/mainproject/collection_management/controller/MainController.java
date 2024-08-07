package com.mainproject.collection_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/collections")
    public String allCollection() {
        return "collections";
    }

    @GetMapping("/collections/{id}")
    public String singleCollection(@PathVariable Long id) {
        return "collection";
    }

    @GetMapping("/collections/new")
    public String createCollection() {
        return "add_new_collection";
    }

    @GetMapping("/collections/{id}/edit")
    public String editCollection(@PathVariable Long id) {
        return "edit_collection";
    }




    @GetMapping("/items")
    public String allItems() {
        return "items";
    }

    @GetMapping("/collections/{collection_id}/items/{item_id}")
    public String singleItem(@PathVariable Long collection_id, @PathVariable Long item_id) {
        return "item";
    }

    @GetMapping("/profile/{profile_id}")
    public String myProfile(@PathVariable Long profile_id) {
        return "profile";
    }
    @GetMapping("/profile/edit/{profile_id}")
    public String editProfile(@PathVariable Long profile_id) {
        return "update_profile_image";
    }

}