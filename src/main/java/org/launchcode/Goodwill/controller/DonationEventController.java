package org.launchcode.Goodwill.controller;


import org.launchcode.Goodwill.model.Address;
import org.launchcode.Goodwill.model.DonationEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/donationEvents")
public class DonationEventController {

    private static List<DonationEvent> donationEvents = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Donation Events");
        model.addAttribute("donationEvents", donationEvents);
        return "donationEvents/index";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, @RequestParam String eventDescription, @RequestParam List<String> eventCategoryList, @RequestParam String eventCategory, @RequestParam Address address ) {
        donationEvents.add(new DonationEvent(eventName, eventDescription, eventCategoryList, eventCategory,address));
        return "redirect:";
    }

    @GetMapping("index")
    public String  createEvent(Model model, @RequestParam DonationEvent donationEvent){
        //TODO : save data in the table.
        model.addAttribute("title","All Donation Events");
        return "donationEvents/create.html";
    }


    @RequestMapping(value = "event",method = {RequestMethod.GET,RequestMethod.POST})
    public String displayEvent(Model model){
        DonationEvent donationEvent = new DonationEvent();
        List<String> category = new ArrayList<>();
        category.add("Book Donation");
        category.add("clothes");
        donationEvent.setEventCategoryList(category);
        model.addAttribute("createEvent",category);
        return "donationEvents/create";
    }



    @PutMapping
    public String updateEvent(Model model , @RequestParam DonationEvent donationEvent){
       //update in the db
        model.addAttribute("createEvent",donationEvent);
        return "event";
    }

    @DeleteMapping("eventId")
    public String deleteEvent(@PathVariable String eventId){
        //delete from the db
            return "";
    }








}
