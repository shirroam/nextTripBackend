package NextTrip.backend.models.DTOs;

import NextTrip.backend.models.ItineraryItem;

import java.util.Date;

public class ItineraryItemDTO {
    int itineraryItemId;
    int itineraryId;
    String name;
    String description;
    Date startDate;
    Date endDate;
    String label;
    int price;

    public ItineraryItemDTO(ItineraryItem itineraryItem) {
        itineraryItemId = itineraryItem.getItineraryItemId();
        itineraryId = itineraryItem.getItinerary().getItineraryId();
        name = itineraryItem.getName();
        description = itineraryItem.getDescription();
        startDate = itineraryItem.getStartDate();
        endDate = itineraryItem.getEndDate();
        label = itineraryItem.getLabel();
        price = itineraryItem.getPrice();
    }

    public int getItineraryItemId() {
        return itineraryItemId;
    }

    public void setItineraryItemId(int itineraryItemId) {
        this.itineraryItemId = itineraryItemId;
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
