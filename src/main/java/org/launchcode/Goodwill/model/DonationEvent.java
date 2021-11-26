package org.launchcode.Goodwill.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonationEvent {

    private  int id;
    private static int nextId = 1;

    public int getId() {
        return id;
    }

    @NotNull
    @Size(min = 3, max =20, message="Event Name is Required" )
    private String eventName;
    private String eventDescription;
    private List<String> eventCategoryList;
    private String eventCategory;

    public DonationEvent( String eventName, String eventDescription, List<String> eventCategoryList, String eventCategory, Address address) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventCategoryList = eventCategoryList;
        this.eventCategory = eventCategory;
        this.address = address;
        this.id = nextId;
        nextId++;
    }

    private Address address;


    @Override
    public String toString() {
        return "DonationEvent{" +
                "eventName='" + eventName + '\'' +
                '}';
    }
}
